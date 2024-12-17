package com.tweener.kmpkit

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform