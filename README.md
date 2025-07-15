[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.tweener/kmpkit?color=orange)](https://central.sonatype.com/artifact/io.github.tweener/kmpkit)
[![Kotlin](https://img.shields.io/badge/kotlin-2.2.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose](https://img.shields.io/badge/compose-1.8.2-blue.svg?logo=jetpackcompose)](https://www.jetbrains.com/lp/compose-multiplatform)
![gradle-version](https://img.shields.io/badge/gradle-8.11.1-blue?logo=gradle)
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
