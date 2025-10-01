# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

KMPKit is a Kotlin Multiplatform utility library targeting Android, iOS, JS, WasmJS, and JVM. It provides extensions, utilities, formatters, and validators to enhance productivity across Kotlin projects.

**Published to Maven Central**: `io.github.tweener:kmpkit`

## Project Structure

This is a multi-module project with the following structure:

- **`kmpkit/`**: The main library module containing all KMP utilities
  - `src/commonMain/`: Shared code for all platforms
  - `src/androidMain/`: Android-specific implementations
  - `src/iosMain/`: iOS-specific implementations
  - `src/jvmMain/`: JVM-specific implementations
  - `src/jsMain/`: JavaScript-specific implementations
  - `src/wasmJsMain/`: WebAssembly-specific implementations
- **`sample/`**: Sample application demonstrating library usage
  - `composeApp/`: Compose Multiplatform sample app
  - `iosApp/`: iOS sample application
- **`buildSrc/`**: Build configuration and custom Gradle tasks
  - `ProjectConfiguration.kt`: Centralized project configuration (version, package names, SDK versions, Maven metadata)

## Common Development Commands

### Build
```bash
./gradlew build                    # Build the entire project
./gradlew :kmpkit:build           # Build only the library module
./gradlew assemble                # Assemble without running tests
```

### Testing
```bash
./gradlew allTests                # Run tests for all targets and create aggregated report
./gradlew check                   # Run all checks and tests
```

### Publishing
```bash
./gradlew publishAllPublicationsToCentralPortal  # Publish to Maven Central
```

### Dependency Management
```bash
./gradlew dependencyUpdates       # Check for dependency updates
```

### Documentation
```bash
./gradlew dokkaHtml              # Generate API documentation with Dokka
```

## Architecture

### Package Organization (in `com.tweener.kmpkit`)

- **`codec/`**: URL encoding/decoding utilities
- **`contract/`**: Kotlin contracts (e.g., `requireNotNullOrThrow`)
- **`formatter/`**: Formatters like `AmountFormatter` for currency formatting
- **`kotlinextensions/`**: Extension functions for core Kotlin types
  - `DateTimeExtensions.kt`: LocalDate, LocalDateTime extensions
  - `FlowExtensions.kt`: Flow operation extensions
  - `CollectionExtensions.kt`, `MapExtensions.kt`: Collection utilities
  - `IntExtensions.kt`, `DoubleExtensions.kt`, `FloatExtensions.kt`: Number extensions
  - `RandomExtensions.kt`: Random number utilities
- **`provider/`**: Provider classes
  - `CurrencyProvider`: Access currency details
  - `LocaleProvider`: Manage locale information
- **`thread/`**: Coroutine utilities and threading tools
- **`utils/`**: General utilities like `SafeLet` and `TrigonometryUtils`
- **`validator/`**: Validators like `EmailAddressValidator`
- **Root files**: `Platform.kt` (platform detection), `DeviceInfo.kt` (device information)

### Platform-Specific Code

When adding platform-specific implementations:
1. Define `expect` declarations in `commonMain`
2. Provide `actual` implementations in each platform's source set
3. Ensure all targeted platforms (Android, iOS, JVM, JS, WasmJS) have implementations

### Version Management

All version information is centralized in `buildSrc/src/main/kotlin/ProjectConfiguration.kt`:
- Library version: `ProjectConfiguration.KMPKit.versionName`
- Minimum SDK: `ProjectConfiguration.KMPKit.minSDK`
- Compile SDK: `ProjectConfiguration.KMPKit.compileSDK`
- Maven publishing metadata

When bumping versions, update `ProjectConfiguration.kt` and `CHANGELOG.md`.

## Key Dependencies

- **Kotlin**: 2.2.0
- **Gradle**: 8.11.1
- **Compose Multiplatform**: 1.8.2
- **Coroutines**: 1.10.2
- **kotlinx-datetime**: 0.7.1 (exposed as `api` dependency)

Dependencies are managed via `gradle/libs.versions.toml` using version catalog.

## Publishing Workflow

KMPKit publishes to Maven Central using the Vanniktech Maven Publish plugin:
- Configured in `kmpkit/build.gradle.kts`
- Automatic release enabled
- Signing is enabled by default (disable with `mavenPublishing.signAllPublications=false`)
- Generated artifacts include sources and Dokka-based Javadoc

## Known Issues

- Dokka Gradle plugin V1 is deprecated; migration to V2 is pending (add `org.jetbrains.dokka.experimental.gradle.pluginMode=V2EnabledWithHelpers` to `gradle.properties` when migrating)
