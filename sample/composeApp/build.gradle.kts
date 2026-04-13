import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kmp.library)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.jetbrains.compose.compiler)
}

kotlin {
    applyDefaultHierarchyTemplate()

    android {
        namespace = ProjectConfiguration.KMPKit.packageName + ".sample"
        compileSdk = ProjectConfiguration.KMPKit.compileSDK
        minSdk = ProjectConfiguration.KMPKit.minSDK

        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(ProjectConfiguration.Compiler.jvmTarget))
        }
    }

    // region iOS configuration

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "composeApp"
            isStatic = true

            // Add here any extra framework dependencies
            export(project(":kmpkit"))
        }
    }

    // endregion iOS configuration

    sourceSets {
        commonMain.dependencies {
            api(project(":kmpkit"))

            // Compose
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(libs.compose.multiplatform.material3)
        }
    }
}
