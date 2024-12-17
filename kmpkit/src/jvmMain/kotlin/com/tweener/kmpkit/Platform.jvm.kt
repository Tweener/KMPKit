package com.tweener.kmpkit

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class JvmPlatform : Platform {
    override val name: String = "JVM"
}

actual fun getPlatform(): Platform = JvmPlatform()
