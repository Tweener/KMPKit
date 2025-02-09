package com.tweener.kmpkit

import platform.UIKit.UIDevice

/**
 * @author Vivien Mahe
 * @since 09/02/2025
 */

actual val currentDeviceInfo: DeviceInfo
    get() =
        DeviceInfo(
            model = UIDevice.currentDevice.model,
            name = UIDevice.currentDevice.name,
            manufacturer = "Apple", // Always "Apple" for iOS devices
        )
