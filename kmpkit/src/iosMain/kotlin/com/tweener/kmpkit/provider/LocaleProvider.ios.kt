package com.tweener.kmpkit.provider

import platform.Foundation.NSLocale
import platform.Foundation.countryCode
import platform.Foundation.currentLocale
import platform.Foundation.languageCode

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class IOSLocaleProvider : LocaleProvider {
    override fun getLanguage(): String = NSLocale.currentLocale.languageCode
    override fun getCountry(): String = NSLocale.currentLocale.countryCode ?: LOCALE_COUNTRY_DEFAULT
}

actual fun createLocaleProvider(): LocaleProvider = IOSLocaleProvider()
