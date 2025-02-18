# Changelog

## [1.0.4] - February 18, 2025
- Add [`Random.nextFloat()`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/RandomExtensions.kt#L13) extension function to return a random float in range.

## [1.0.3] - February 11, 2025
- Add [`currentDeviceInfo`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/DeviceInfo.kt) value to retrieve the info of the device on which the code is running.

## [1.0.2] - January 30, 2025
- Add [`currentPlatformVersion`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/Platform.kt#L36) value to retrieve the current platform version on which the code is running.
- 🤖 On Android, add [`Context.getRawUri()`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/androidMain/kotlin/com/tweener/kmpkit/kotlinextensions/ContextExtensions.kt#L34) extension function to get the URI of a raw resource file.

## [1.0.1] - January 5, 2025
- Bump major version due to a versionning conflict (1.0.0 was previously released by mistake)
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
