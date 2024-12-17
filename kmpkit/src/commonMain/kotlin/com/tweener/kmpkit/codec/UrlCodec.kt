package com.tweener.kmpkit.codec

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */
class UrlCodec {
    fun decode(encodedUrl: String): String = decodeUrl(encodedUrl = encodedUrl)
}

expect fun decodeUrl(encodedUrl: String): String
