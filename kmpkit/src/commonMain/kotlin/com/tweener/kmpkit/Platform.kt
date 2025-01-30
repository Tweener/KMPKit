package com.tweener.kmpkit

/**
 * Enum class representing the different platforms.
 *
 * Currently, it includes options for Android and iOS, but more platforms might be added in the future.
 *
 * @author Vivien Mahe
 * @since 24/07/2024
 */
enum class Platform {
    ANDROID,
    IOS,
    JS,
    WASM_JS,
    JVM
}

/**
 * The current platform on which the code is running.
 *
 * This is an expected property that should be implemented in the respective platform-specific module.
 * It returns a value from the [Platform] enum indicating the platform on which the code is currently running.
 * Currently, it includes options for Android and iOS, but more platforms might be added in the future.
 */
expect val currentPlatform: Platform

/**
 * The current platform version on which the code is running. It returns a string representing the version of the platform.
 *
 * - On **Android**, this might return the Android API level or version (e.g., "Android 14").
 * - On **iOS**, it could return the iOS system version (e.g., "iOS 17.2").
 * - On **JVM**, it might return the Java version (e.g., "Java 17").
 * - On **JS** or **WASM**, it could return the browser or runtime version.
 */
expect val currentPlatformVersion: String
