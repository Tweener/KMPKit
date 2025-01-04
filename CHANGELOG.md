# Changelog

## [0.1.2] - January 4, 2025
- Add a LocalDateTime extension function to [ignore nano seconds](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt#L160).

## [0.1.1] - December 18, 2024
- Retrieve the [Platform](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/Platform.kt) type for the current target.
- Add [Safelet](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/Safelet.kt) helper functions to safely combine multiple .let{} operations.

## [0.1.0] - December 17, 2024

### 🚀 Initial Release

The first official release of **KMPKit**.

#### Features
  * **Kotlin contracts** `requireNotNullOrThrow` – Safely enforce non-null values
  * **Formatters**: `AmountFormatter` – Format amounts according to the specified currency and locale.
  * **Kotlin extension**s: Enhance core types with handy extensions:
    * **Numbers**: Int, Double, Float
    * **Collections**: Map, Collection
    * **Date & Time**: LocalDate, LocalDateTime
    * **Flows**: Extensions for Flow operations
  * **URL utilities**: `UrlCodec` – Decode and manage URLs easily.
  * **Providers**
    * **CurrencyProvider**: Access currency details seamlessly.
    * **LocaleProvider**: Retrieve and manage locale information.
  * **Trigonometry itilities**: Simplify mathematical calculations with utility functions for trigonometry.
  * **Validators**: EmailValidator – Validate email addresses reliably.
