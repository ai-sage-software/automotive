const prismThemes = require('prism-react-renderer').themes;

/** @type {import('@docusaurus/types').Config} */
module.exports = {
  title: 'STAR Domain Model',
  tagline: 'Friendly docs for the STAR Automotive Domain Model',
  favicon: 'img/favicon.ico',

  url: 'https://starstandard.github.io',
  baseUrl: '/automotive/',

  organizationName: 'starstandard',
  projectName: 'automotive',

  // Keep strict build behavior for broken site links
  onBrokenLinks: 'throw',

  // ✅ Fix deprecation: move broken markdown handling here
  markdown: {
    hooks: {
      onBrokenMarkdownLinks: 'warn',
    },
  },

  i18n: {
    defaultLocale: 'en',
    locales: ['en'],
  },

  presets: [
    [
      'classic',
      {
        docs: {
          routeBasePath: '/', // docs at site root (https://starstandard.github.io/automotive/)
          sidebarPath: require.resolve('./sidebars.js'),
          editUrl: 'https://github.com/starstandard/automotive/edit/main/website/',
        },
        blog: false,
        theme: {
          customCss: require.resolve('./src/css/custom.css'),
        },
      },
    ],
  ],

  themeConfig: {
    navbar: {
      title: 'STAR Docs',
      items: [
        { to: '/', label: 'Domain Model', position: 'left' },
        { to: '/getting-started/overview', label: 'Getting Started', position: 'left' },
        { href: 'https://github.com/starstandard/automotive', label: 'GitHub', position: 'right' },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Docs',
          items: [
            { label: 'Domain Model', to: '/' },
            { label: 'Getting Started', to: '/getting-started/overview' },
          ],
        },
        {
          title: 'Repository',
          items: [
            {
              label: 'starstandard/automotive',
              href: 'https://github.com/starstandard/automotive',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} STAR.`,
    },
    prism: {
      theme: prismThemes.github,
      darkTheme: prismThemes.dracula,
    },
  },
};
