[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.tweener/KMPKit?color=orange)](https://central.sonatype.com/artifact/io.github.tweener/KMPKit)
[![Kotlin](https://img.shields.io/badge/kotlin-2.0.21-blue.svg?logo=kotlin)](http://kotlinlang.org)
![gradle-version](https://img.shields.io/badge/gradle-8.5.2-blue?logo=gradle)
[![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](https://opensource.org/licenses/Apache-2.0)

[![Website](https://img.shields.io/badge/Author-vivienmahe.com-purple)](https://vivienmahe.com/)
[![X/Twitter](https://img.shields.io/twitter/follow/VivienMahe)](https://twitter.com/VivienMahe)

---

# KMPKit

**KMPKit** is a Kotlin Multiplatform utility library targeting Android, iOS, JS, WasmJS, and JVM. It offers an extensive toolkit of extensions, utilities, formatters, and validators to enhance productivity across Kotlin projects.

<br>

Be sure to show your support by starring ⭐️ this repository!

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
kmpkit = "1.0.0" // Check latest version

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
    val kmpkit_version = "1.0.0" // Check latest version

    implementation("io.github.tweener:kmpkit:$kmpkit_version")
}
```

The latest version is: [![Maven Central Version](https://img.shields.io/maven-central/v/io.github.tweener/KMPKit?color=orange)](https://central.sonatype.com/artifact/io.github.tweener/KMPKit)

---
