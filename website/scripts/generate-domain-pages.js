/* eslint-disable no-console */
const fs = require('fs');
const path = require('path');

const repoRoot = path.resolve(__dirname, '..', '..');
const domainRoot = path.join(repoRoot, 'domain');

const outRoot = path.join(__dirname, '..', 'docs', 'domains');

function isDir(p) {
  try {
    return fs.statSync(p).isDirectory();
  } catch {
    return false;
  }
}

function safeSlug(name) {
  return name.replace(/[^a-zA-Z0-9-_]/g, '_');
}

function writeFile(filePath, content) {
  fs.mkdirSync(path.dirname(filePath), { recursive: true });
  fs.writeFileSync(filePath, content, 'utf8');
}

function main() {
  if (!isDir(domainRoot)) {
    console.warn(`[generate-domain-pages] No domain folder found at: ${domainRoot}`);
    return;
  }

  // Clear previous generated domain docs (keep folder)
  fs.mkdirSync(outRoot, { recursive: true });
  for (const entry of fs.readdirSync(outRoot)) {
    const p = path.join(outRoot, entry);
    fs.rmSync(p, { recursive: true, force: true });
  }

  const topLevel = fs.readdirSync(domainRoot)
    .map((name) => ({ name, full: path.join(domainRoot, name) }))
    .filter((x) => isDir(x.full))
    .sort((a, b) => a.name.localeCompare(b.name));

  // Create an index page for Domains
  const indexMd = [
    '---',
    'title: Domains',
    '---',
    '',
    'This section is **generated from the repo’s `/domain` folder** at build time.',
    '',
    '## Domain folders',
    '',
    ...topLevel.map((d) => `- **${d.name}** → [Open](./${safeSlug(d.name)}/intro)`),
    '',
  ].join('\n');

  writeFile(path.join(outRoot, 'index.md'), indexMd);

  // Create one “intro.md” per domain folder
  for (const d of topLevel) {
    const slug = safeSlug(d.name);
    const relGithub = `https://github.com/starstandard/automotive/tree/main/domain/${encodeURIComponent(d.name)}`;

    const content = [
      '---',
      `title: ${d.name}`,
      '---',
      '',
      `GitHub: ${relGithub}`,
      '',
      '## What’s in this domain?',
      '',
      'Add a short business-friendly description here.',
      '',
      '## Key artifacts',
      '',
      '- APIs:',
      '- Schemas:',
      '- Examples:',
      '- Diagrams:',
      '',
    ].join('\n');

    writeFile(path.join(outRoot, slug, 'intro.md'), content);
  }

  console.log(`[generate-domain-pages] Generated ${topLevel.length} domain intro pages.`);
}

main();
