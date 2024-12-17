package com.tweener.kmpkit.codec

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

@JsName("decodeURIComponent")
external fun jsDecodeURIComponent(encodedUrl: String): String

actual fun decodeUrl(encodedUrl: String): String {
    return try {
        jsDecodeURIComponent(encodedUrl)
    } catch (e: Throwable) {
        encodedUrl // Return the original string in case of failure
    }
}
