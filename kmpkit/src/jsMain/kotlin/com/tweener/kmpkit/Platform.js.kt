package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 24/07/2024
 */

actual val currentPlatform = Platform.JS

actual val currentPlatformVersion: String
    get() = "JS (${js("navigator.userAgent") as? String ?: "Unknown"})"
