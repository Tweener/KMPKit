package com.tweener.kmpkit.codec

import java.net.URLDecoder

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

actual fun decodeUrl(encodedUrl: String): String = URLDecoder.decode(encodedUrl, "UTF-8")
