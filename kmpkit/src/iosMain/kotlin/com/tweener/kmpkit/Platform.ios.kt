package com.tweener.kmpkit

import platform.UIKit.UIDevice

/**
 * @author Vivien Mahe
 * @since 24/07/2024
 */

actual val currentPlatform = Platform.IOS

actual val currentPlatformVersion: String
    get() = "iOS ${UIDevice.currentDevice.systemVersion}"
