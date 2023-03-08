export interface ZoomPluginPlugin {
    /**
   * Enable pinch-zoom on Android. Does nothing on web and iOS. 
   *
   * @param none
   * @since 0.0.1
   */
  enableZoom(): Promise<void>;

  /**
   * Disable pinch-zoom on Android. Does nothing on web and iOS. 
   *
   * @param none
   * @since 0.0.1
   */
  disableZoom(): Promise<void>;
}
