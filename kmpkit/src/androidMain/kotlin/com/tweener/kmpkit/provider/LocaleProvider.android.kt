package com.tweener.kmpkit.provider

import java.util.Locale

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class AndroidLocaleProvider : LocaleProvider {
    override fun getLanguage(): String = Locale.getDefault().language
    override fun getCountry(): String = Locale.getDefault().country
}

actual fun createLocaleProvider(): LocaleProvider = AndroidLocaleProvider()
