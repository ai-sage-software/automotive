/**
 * Generate Docusaurus docs pages from repo /domain folders.
 *
 * Output:
 *   website/docs/domains/index.md
 *   website/docs/domains/<domain>/intro.md
 *
 * Important rules:
 * - Ignore folders starting with "_" or "." (e.g. _GETTING_STARTED)
 * - Use lowercase slugs for folder names & links to avoid case issues across OS/filesystems
 */

const fs = require("fs");
const path = require("path");

/** Repo root is one level above /website */
const repoRoot = path.resolve(__dirname, "..", "..");

/** Source of truth: repo /domain */
const domainRoot = path.join(repoRoot, "domain");

/** Generated docs live here */
const docsDomainsRoot = path.join(repoRoot, "website", "docs", "domains");

function isDir(p) {
  try {
    return fs.statSync(p).isDirectory();
  } catch {
    return false;
  }
}

/**
 * Turn a folder name into a safe doc folder slug.
 * - keep letters/numbers/_/-
 * - convert whitespace to _
 * - lowercase
 */
function toSlug(name) {
  return String(name)
    .trim()
    .replace(/\s+/g, "_")
    .replace(/[^a-zA-Z0-9_-]/g, "_")
    .replace(/_+/g, "_")
    .replace(/^_+|_+$/g, "")
    .toLowerCase();
}

/** Only include "real" domains */
function includeDomainFolder(folderName) {
  if (!folderName) return false;
  if (folderName.startsWith("_")) return false; // exclude _GETTING_STARTED, etc.
  if (folderName.startsWith(".")) return false; // exclude .gitkeep, etc.
  return true;
}

function ensureDir(p) {
  fs.mkdirSync(p, { recursive: true });
}

function writeFile(filePath, content) {
  ensureDir(path.dirname(filePath));
  fs.writeFileSync(filePath, content, "utf8");
}

function cleanGeneratedDomainFolders(outRoot, keepFolders = new Set()) {
  // Clean only auto-generated domain subfolders (not docs/domains/index.md).
  // If you manually put other docs in docs/domains, keep them by naming convention
  // or add them to keepFolders.
  if (!isDir(outRoot)) return;

  for (const entry of fs.readdirSync(outRoot)) {
    const full = path.join(outRoot, entry);
    if (!isDir(full)) continue;

    // We only manage folders we generate: lowercase slugs, not starting with "_" or "."
    // If you want, you can make this stricter (e.g. require intro.md present).
    if (keepFolders.has(entry)) continue;

    // Remove only folders that look like generated domain folders
    // (lowercase + underscores/hyphens + alphanumerics)
    if (/^[a-z0-9][a-z0-9_-]*$/.test(entry)) {
      fs.rmSync(full, { recursive: true, force: true });
    }
  }
}

function main() {
  if (!isDir(domainRoot)) {
    console.error(`[generate-domain-pages] ERROR: Not found: ${domainRoot}`);
    process.exit(1);
  }

  // Discover domain folders
  const domainFolders = fs
    .readdirSync(domainRoot)
    .filter((name) => includeDomainFolder(name))
    .map((name) => ({
      name,
      abs: path.join(domainRoot, name),
      slug: toSlug(name),
    }))
    .filter((d) => isDir(d.abs))
    .sort((a, b) => a.slug.localeCompare(b.slug));

  // Ensure docs/domains exists
  ensureDir(docsDomainsRoot);

  // Optionally clean old generated folders before re-creating
  // Keep nothing by default; we regenerate everything each run.
  // (We do NOT delete docs/domains itself.)
  cleanGeneratedDomainFolders(docsDomainsRoot);

  // Generate per-domain intro pages
  for (const d of domainFolders) {
    const outDir = path.join(docsDomainsRoot, d.slug);
    const outFile = path.join(outDir, "intro.md");

    const ghUrl = `https://github.com/starstandard/automotive/tree/main/domain/${encodeURIComponent(
      d.name
    )}`;

    const md = `---
title: ${d.slug}
---

# ${d.slug}

- Source folder: \`/domain/${d.name}\`
- GitHub: ${ghUrl}

## What’s inside
This page is a friendly entry point for the **${d.slug}** domain.

> Tip: Add a \`README.md\` inside \`/domain/${d.name}\` and we can enhance this page by auto-pulling summary text from it.

`;

    writeFile(outFile, md);
  }

  // Generate domains index
  const indexLines = [];
  indexLines.push("---");
  indexLines.push('title: "Domains"');
  indexLines.push('description: "This section is generated from the repo’s /domain folder at build time."');
  indexLines.push("---");
  indexLines.push("");
  indexLines.push("# Domains");
  indexLines.push("");
  indexLines.push("This list is generated from the repository’s `domain/` folder.");
  indexLines.push("");
  indexLines.push("## Available domains");
  indexLines.push("");

  if (domainFolders.length === 0) {
    indexLines.push("_No domain folders found under `/domain`._");
  } else {
    for (const d of domainFolders) {
      // Relative link from docs/domains/index.md → docs/domains/<slug>/intro.md
      indexLines.push(`- **${d.slug}** → [Open](./${d.slug}/intro)`);
    }
  }

  indexLines.push("");
  indexLines.push("## Exclusions");
  indexLines.push("");
  indexLines.push("Folders starting with `_` or `.` are excluded (for example: `_GETTING_STARTED`).");
  indexLines.push("");

  writeFile(path.join(docsDomainsRoot, "index.md"), indexLines.join("\n"));

  console.log(
    `[generate-domain-pages] Generated ${domainFolders.length} domain intro pages.`
  );
}

main();
