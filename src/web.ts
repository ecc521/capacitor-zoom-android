import { WebPlugin } from '@capacitor/core';

import type { ZoomPluginPlugin } from './definitions';

export class ZoomPluginWeb extends WebPlugin implements ZoomPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
