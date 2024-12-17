package com.tweener.kmpkit.contract

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

/**
 * @author Vivien Mahe
 * @since 17/12/2024
 */

@OptIn(ExperimentalContracts::class)
inline fun <T : Any> requireNotNullOrThrow(value: T?, throwable: () -> Throwable): T {
    contract {
        returns() implies (value != null)
    }

    if (value == null) {
        throw throwable()
    } else {
        return value
    }
}
