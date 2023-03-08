export interface ZoomPluginPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
