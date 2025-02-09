package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 09/02/2025
 */

actual val currentDeviceInfo: DeviceInfo
    get() =
        DeviceInfo(
            model = null, // JS/Wasm doesn't expose device model directly
            name = js("window.navigator.platform") as String?,
            manufacturer = null, // No standard way to get manufacturer in JS
        )
