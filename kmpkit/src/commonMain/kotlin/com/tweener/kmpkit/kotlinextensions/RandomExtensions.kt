package com.tweener.kmpkit.kotlinextensions

import kotlin.random.Random

/**
 * @author Vivien Mahe
 * @since 14/02/2025
 */

/**
 * Returns a random float between the specified [min] and [max] values.
 */
fun Random.nextFloat(min: Float, max: Float): Float {
    return min + nextFloat() * (max - min)
}
