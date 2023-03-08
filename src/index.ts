import { registerPlugin } from '@capacitor/core';

import type { ZoomPluginPlugin } from './definitions';

const ZoomPlugin = registerPlugin<ZoomPluginPlugin>('ZoomPlugin', {
  web: () => import('./web').then(m => new m.ZoomPluginWeb()),
});

export * from './definitions';
export { ZoomPlugin };
