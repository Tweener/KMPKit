package com.tweener.kmpkit.provider

import platform.Foundation.NSLocale
import platform.Foundation.currencyCode
import platform.Foundation.localeWithLocaleIdentifier

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class IOSCurrencyProvider(
    private val localeProvider: LocaleProvider,
) : CurrencyProvider {
    override fun getCurrencyCode(): String? = NSLocale.localeWithLocaleIdentifier(localeProvider.getLanguage()).currencyCode
}

actual fun createCurrencyProvider(localeProvider: LocaleProvider): CurrencyProvider = IOSCurrencyProvider(localeProvider)
