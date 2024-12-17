package com.tweener.kmpkit.kotlinextensions

/**
 * @author Vivien Mahe
 * @since 21/09/2023
 */

fun <T> MutableCollection<T>.replace(elements: Collection<T>) = with(this) { clear(); addAll(elements) }
