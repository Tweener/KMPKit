package com.tweener.kmpkit.codec

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

import platform.Foundation.NSString
import platform.Foundation.stringByRemovingPercentEncoding

actual fun decodeUrl(encodedUrl: String): String =
    (encodedUrl as NSString).stringByRemovingPercentEncoding ?: encodedUrl
