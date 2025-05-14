import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.net.URL

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.dokka)
    alias(libs.plugins.maven.publish)
}

android {
    namespace = ProjectConfiguration.KMPKit.namespace
    compileSdk = ProjectConfiguration.KMPKit.compileSDK

    defaultConfig {
        minSdk = ProjectConfiguration.KMPKit.minSDK

        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
        }
    }

    compileOptions {
        sourceCompatibility = ProjectConfiguration.Compiler.javaCompatibility
        targetCompatibility = ProjectConfiguration.Compiler.javaCompatibility
    }
}

kotlin {
    applyDefaultHierarchyTemplate()

    androidTarget {
        publishLibraryVariants("release")

        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(ProjectConfiguration.Compiler.jvmTarget))
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "kmpkit"
            isStatic = true
        }
    }

    jvm()

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
            commonWebpackConfig {
                outputFileName = "kmpkit.js"
            }
        }
        binaries.executable()
    }

    js(IR) {
        browser {
            commonWebpackConfig {
                outputFileName = "kmpkit.js"
            }
        }
        binaries.executable()
    }

    sourceSets {
        commonMain.dependencies {
            // Coroutines
            implementation(libs.kotlin.coroutines.core)

            // Datetime
            api(libs.kotlin.datetime)
        }

        androidMain.dependencies {
            // Coroutines
            implementation(libs.kotlin.coroutines.android)

            // Android
            api(libs.android.core)
        }

        iosMain.dependencies {

        }

        wasmJsMain.dependencies {
            implementation(libs.kotlin.browser)
        }
    }
}

// region Publishing

group = ProjectConfiguration.KMPKit.Maven.group
version = ProjectConfiguration.KMPKit.versionName

// Dokka configuration
tasks.register<Jar>("dokkaJavadocJar") {
    dependsOn(tasks.dokkaHtml)
    from(tasks.dokkaHtml.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {
        jdkVersion.set(ProjectConfiguration.Compiler.jvmTarget.toInt())
        languageVersion.set(libs.versions.kotlin)

        sourceLink {
            localDirectory.set(rootProject.projectDir)
            remoteUrl.set(URL(ProjectConfiguration.KMPKit.Maven.packageUrl + "/tree/main"))
            remoteLineSuffix.set("#L")
        }
    }
}

mavenPublishing {
    publishToMavenCentral(host = SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)
    signAllPublications()
    coordinates(groupId = group.toString(), artifactId = ProjectConfiguration.KMPKit.Maven.name.lowercase(), version = version.toString())

    artifacts {
        this.archives(tasks["dokkaJavadocJar"])
    }

    pom {
        name = ProjectConfiguration.KMPKit.Maven.name
        description = ProjectConfiguration.KMPKit.Maven.description
        url = ProjectConfiguration.KMPKit.Maven.packageUrl

        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }

        issueManagement {
            system = "GitHub Issues"
            url = "${ProjectConfiguration.KMPKit.Maven.packageUrl}/issues"
        }

        developers {
            developer {
                id = ProjectConfiguration.KMPKit.Maven.Developer.id
                name = ProjectConfiguration.KMPKit.Maven.Developer.name
                email = ProjectConfiguration.KMPKit.Maven.Developer.email
            }
        }

        scm {
            connection = "scm:git:git://${ProjectConfiguration.KMPKit.Maven.gitUrl}"
            developerConnection = "scm:git:ssh://${ProjectConfiguration.KMPKit.Maven.gitUrl}"
            url = ProjectConfiguration.KMPKit.Maven.packageUrl
        }
    }
}

// endregion Publishing
