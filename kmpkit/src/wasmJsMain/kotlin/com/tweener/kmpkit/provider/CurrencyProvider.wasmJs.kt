package com.tweener.kmpkit.provider

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

class JsCurrencyProvider(
    private val localeProvider: LocaleProvider,
) : CurrencyProvider {
    override fun getCurrencyCode(): String? {
        val locale = Locale(localeProvider.getLanguage(), localeProvider.getCountry())
        return CURRENCY_DEFAULT // TODO Change this later
    }
}

actual fun createCurrencyProvider(localeProvider: LocaleProvider): CurrencyProvider = JsCurrencyProvider(localeProvider)
