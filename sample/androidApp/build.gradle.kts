plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.jetbrains.compose.compiler)
}

android {
    namespace = ProjectConfiguration.KMPKit.packageName + ".sample"
    compileSdk = ProjectConfiguration.KMPKit.compileSDK

    defaultConfig {
        applicationId = ProjectConfiguration.KMPKit.packageName + ".sample"
        minSdk = ProjectConfiguration.KMPKit.minSDK
        targetSdk = ProjectConfiguration.KMPKit.compileSDK
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = ProjectConfiguration.Compiler.javaCompatibility
        targetCompatibility = ProjectConfiguration.Compiler.javaCompatibility
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":sample:composeApp"))
    implementation(libs.android.activity)
    implementation(libs.android.activity.compose)
}
