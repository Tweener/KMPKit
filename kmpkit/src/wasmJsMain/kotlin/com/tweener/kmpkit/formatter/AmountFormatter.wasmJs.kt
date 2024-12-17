package com.tweener.kmpkit.formatter

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

internal actual fun getFormattedAmount(value: Double, currency: String, localeLanguage: String, showDecimals: Boolean): String {
//    val numberFormat = NumberFormat.getCurrencyInstance(Locale(localeLanguage)).apply {
//        this.currency = Currency.getInstance(currency)
//        if (showDecimals.not()) maximumFractionDigits = 0
//        if (showDecimals.not()) minimumFractionDigits = 0
//    }
//
//    return numberFormat.format(value)
    return "Not implemented" // TODO
}
