import { WebPlugin } from '@capacitor/core';

import type { ZoomPluginPlugin } from './definitions';

export class ZoomPluginWeb extends WebPlugin implements ZoomPluginPlugin {
  async enableZoom() {}
  async disableZoom() {}
}
