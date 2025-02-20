package com.tweener.kmpkit.provider

import android.icu.util.Currency
import java.util.Locale

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class AndroidCurrencyProvider(
    private val localeProvider: LocaleProvider,
) : CurrencyProvider {
    override fun getCurrencyCode(): String? {
        val locale = Locale(localeProvider.getLanguage(), localeProvider.getCountry())

        return try {
            Currency.getInstance(locale).currencyCode
        } catch (throwable: Throwable) {
            null
        }
    }
}

actual fun createCurrencyProvider(localeProvider: LocaleProvider): CurrencyProvider = AndroidCurrencyProvider(localeProvider)
