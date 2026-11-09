[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.tweener/kmpkit?color=orange)](https://central.sonatype.com/artifact/io.github.tweener/kmpkit)
[![Kotlin](https://img.shields.io/badge/kotlin-2.4.21-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose](https://img.shields.io/badge/compose-1.12.2-blue.svg?logo=jetpackcompose)](https://www.jetbrains.com/lp/compose-multiplatform)
![gradle-version](https://img.shields.io/badge/gradle-9.5.1-blue?logo=gradle)
[![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](LICENSE)

[![Website](https://img.shields.io/badge/Author-vivienmahe.com-purple)](https://vivienmahe.com/)
[![X/Twitter](https://img.shields.io/twitter/follow/VivienMahe)](https://twitter.com/VivienMahe)

---

# KMPKit

**KMPKit** is a Kotlin Multiplatform utility library targeting Android, iOS, JS, WasmJS, and JVM. It offers an extensive toolkit of extensions, utilities, formatters, and validators to enhance productivity across Kotlin projects.

<br>

Be sure to show your support by starring ⭐️ this repository!

---

## ✨ What's inside

Everything lives in the `com.tweener.kmpkit` package and works on every target, unless stated otherwise.

### Platform & device
- `currentPlatform`: the platform the code runs on (`ANDROID`, `IOS`, `JS`, `WASM_JS` or `JVM`).
- `currentPlatformVersion`: a description of the platform version (e.g. "Android 14 (SDK 34)", "iOS 17.2", "JVM 21.0.2").
- `currentDeviceInfo`: the device model, name and manufacturer, when available.

### Date & time (`kotlinx-datetime`)
- `LocalDateTime.now()`, `LocalDate.now()` and `LocalTime.now()`, with an optional time zone.
- Comparisons: `isAfter`, `isBefore`, `isSameDate`, `isToday`.
- Conversions: `toEpochMilliseconds()`, `Long.fromEpochMilliseconds()`, `LocalDate.toLocalDateTime()`.
- Calendar helpers: `daysInMonth()`, `getDaysInYear()`, `isLeapYear()`, `withDayOfMonth()`, `monthsSince()`.
- `LocalDateTime.plus(value, unit)` and `plus(duration)`, plus `ignoreNanoSeconds()`.

### Numbers
- `round(decimalPrecision)` for `Double` and `Float`.
- `applyPercent(percent)` and `safeDiv(divisor, resultIfZero)` for `Int`, `Float` and `Double`.
- `Random.nextFloat(min, max)`.

### Trigonometry
- `Degrees` and `Radians` value classes with arithmetic and comparison operators, created with `.degrees` and `.radians` on `Float` and `Double`, and converted with `toRadians()` and `toDegrees()`.

### Coroutines & Flow
- `Flow.conditional(condition, ifTrue, ifFalse)`: switches to one of two flows depending on each emitted value.
- `CoroutineScope.onInit { }`: runs a block once and exposes it as a `StateFlow`.
- `combine` overloads for 6, 7 and 8 flows.
- `suspendCatching { }`: a `runCatching` for suspending code.
- `CancellableContinuation.resumeIfActive()` and `resumeWithExceptionIfActive()`.

### Formatting & validation
- `formatAmount(value, currency, localeLanguage)`: formats an amount for a currency and a locale, with optional decimals and "k", "M" and "B" abbreviations.
- `EmailAddressValidator().isValid(email)`.
- `UrlCodec().decode(encodedUrl)`: decodes a URL-encoded string.

### Providers
- `createLocaleProvider()`: the current language and country.
- `createCurrencyProvider(localeProvider)`: the currency code for that locale.

### Kotlin helpers
- `safeLet(p1, p2, ...)`: runs a block only when all 2 to 6 values are non-null.
- `requireNotNullOrThrow(value) { throwable }`: returns the value or throws your own exception.
- `MutableCollection.replace(elements)` and `MutableMap.replace(elements)`: clear, then add all.

### Android only
- `Context.getAlarmManager()`, `Context.getNotificationManager()` and `Context.getRawUri(rawFilename)`.

---

## 🛠️ Installation

In your `settings.gradle.kts` file, add Maven Central to your repositories:
```Groovy
repositories {
    mavenCentral()
}
```

Then add KMPKit dependency to your module:

- With version catalog, open `libs.versions.toml`:
```Groovy
[versions]
kmpkit = "1.*.*" // Check latest version

[libraries]
kmpkit = { group = "io.github.tweener", name = "kmpkit", version.ref = "kmpkit" }
```

Then in your module `build.gradle.kts` add:
```Groovy
dependencies {
    implementation(libs.kmpkit)
}
```

- Without version catalog, in your module `build.gradle.kts` add:
```Groovy
dependencies {
    val kmpkit_version = "1.*.*" // Check latest version

    implementation("io.github.tweener:kmpkit:$kmpkit_version")
}
```

The latest version is: [![Maven Central Version](https://img.shields.io/maven-central/v/io.github.tweener/kmpkit?color=orange)](https://central.sonatype.com/artifact/io.github.tweener/kmpkit)

---

## 📜 Licence

KMPKit is licensed under the [Apache-2.0](LICENSE).
