package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 28/11/2024
 */

actual val currentPlatform = Platform.JVM

actual val currentPlatformVersion: String
    get() = "JVM ${System.getProperty("java.version")}"
