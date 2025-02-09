package com.tweener.kmpkit

import android.os.Build

/**
 * @author Vivien Mahe
 * @since 24/07/2024
 */

actual val currentPlatform = Platform.ANDROID

actual val currentPlatformVersion: String
    get() = "Android ${Build.VERSION.RELEASE} (SDK ${Build.VERSION.SDK_INT})"
