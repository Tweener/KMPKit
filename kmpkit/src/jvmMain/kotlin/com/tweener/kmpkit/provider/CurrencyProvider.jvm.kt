package com.tweener.kmpkit.provider

import java.util.Currency
import java.util.Locale

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class JvmCurrencyProvider(
    private val localeProvider: LocaleProvider,
) : CurrencyProvider {
    override fun getCurrencyCode(): String? {
        val locale = Locale.of(localeProvider.getLanguage(), localeProvider.getCountry())
        return Currency.getInstance(locale).currencyCode
    }
}

actual fun createCurrencyProvider(localeProvider: LocaleProvider): CurrencyProvider = JvmCurrencyProvider(localeProvider)
