package com.tweener.kmpkit

import android.os.Build

/**
 * @author Vivien Mahe
 * @since 09/02/2025
 */

actual val currentDeviceInfo: DeviceInfo
    get() = DeviceInfo(
        model = Build.MODEL,
        name = Build.DEVICE,
        manufacturer = Build.MANUFACTURER,
    )
