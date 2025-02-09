package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 09/02/2025
 */

/**
 * Data class representing device-specific information.
 *
 * @property model The model of the device (e.g., "iPhone 12", "Pixel 6", or "MacBookPro").
 * @property name The user-defined name of the device (e.g., "John's iPhone").
 * @property manufacturer The manufacturer of the device (e.g., "Apple", "Google", "Samsung").
 */
data class DeviceInfo(
    val model: String?,
    val name: String?,
    val manufacturer: String?,
)

/**
 * Provides the current device's information on which the code is running.
 */
expect val currentDeviceInfo: DeviceInfo
