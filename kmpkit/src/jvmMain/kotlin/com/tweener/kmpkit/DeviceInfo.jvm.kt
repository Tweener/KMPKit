package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 09/02/2025
 */

actual val currentDeviceInfo: DeviceInfo
    get() =
        DeviceInfo(
            model = System.getProperty("os.name"),
            name = System.getProperty("user.name"),
            manufacturer = null, // No standard way to get manufacturer in JS
        )
