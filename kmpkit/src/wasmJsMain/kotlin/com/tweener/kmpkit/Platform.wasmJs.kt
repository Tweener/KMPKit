package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 24/07/2024
 */

actual val currentPlatform = Platform.WASM_JS

actual val currentPlatformVersion: String
    get() = "Web with Kotlin/Wasm"
