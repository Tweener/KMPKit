# Changelog

## [1.0.14] - April 13, 2026
- Update Kotlin to 2.3.20.
- Update Gradle to 9.1.0.
- Update Compose Multiplatform to 1.10.3.
- Update Dokka to 2.2.0.
- Update Maven Publish plugin to 0.36.0.
- Update Android core to 1.18.0.
- Update Android activity to 1.13.0.
- Fix deprecated `Locale` constructor usage in `AmountFormatter`.

## [1.0.13] - October 27, 2025
- Update Kotlin to 2.2.20.
- Update Gradle to 8.13.0.
- Update Compose Multiplatform to 1.9.1.
- Update Material3 to 1.9.0.
- Update Dokka to 2.1.0.
- Update Android compile SDK to 36.

## [1.0.12] - October 27, 2025
- Add [`LocalDate.isToday()`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt) extension function to check if a date is today in a specified time zone.
- Remove iosX64 target from build and publish configs.

## [1.0.11] - October 1, 2025
- Update Kotlin to 2.2.20.
- Update Gradle to 8.13.0.
- Update Compose Multiplatform to 1.9.0.
- Update Material3 to 1.9.0-beta06.
- Update Maven Publish plugin to 0.34.0.
- Update Dependency Versions plugin to 0.53.0.
- Update kotlinx-browser to 0.5.0.
- Update Android core to 1.17.0.
- Update Android activity to 1.11.0.
- Add [`LocalDate.getDaysInYear()`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt) extension function to get the number of days in the year.
- Add [`LocalDate.isLeapYear()`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt) extension function to check if the year is a leap year.

## [1.0.10] - July 15, 2025
- Update Kotlin to 2.2.0.
- Update Gradle to 8.11.1.
- Update Compose Multiplatform to 1.8.2.
- Update Coroutines to 1.10.2.
- Kotlin Datetime: 0.7.1

## [1.0.9] - May 14, 2025
- [BREAKING] Move SafeLet from package `com.tweener.kmpkit` to `com.tweener.kmpkit.utils`.

## [1.0.8] - May 13, 2025
- Update Kotlin to 2.1.21.
- Update Compose Multiplatform to 1.8.0.
- Migrate from Sonatype to Maven Central publishing.

## [1.0.7] - April 15, 2025
- Update Kotlin to 2.1.20.
- Update Gradle to 8.11.1.
- Update Compose Multiplatform to 1.7.3.
- Update Coroutines to 1.10.1.

## [1.0.6] - March 19, 2025
- Add [`LocalDateTime.monthsSince`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt#L174) extension function to return the number of months between two LocalDateTime.
- Add [`LocalDateTime.withDayOfMonth`](https://github.com/Tweener/KMPKit/blob/main/kmpkit/src/commonMain/kotlin/com/tweener/kmpkit/kotlinextensions/DateTimeExtensions.kt#L193) extension function to return a new LocalDate with the specified day of the month.

## [1.0.5] - February 24, 2025
- Fixes `Currency.getInstance(locale).currencyCode` returning `null` on some Android devives.

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
