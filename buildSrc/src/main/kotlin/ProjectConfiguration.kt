import org.gradle.api.JavaVersion

/**
 * @author Vivien Mahe
 * @since 23/07/2022
 */

object ProjectConfiguration {

    object KMPKit {
        const val packageName = "com.tweener.kmpkit"
        const val versionName = "1.0.6"
        const val namespace = "$packageName.android"
        const val compileSDK = 35
        const val minSDK = 24

        object Maven {
            const val name = "KMPKit"
            const val description = "A Kotlin Multiplatform utility library offering extensions, validators, providers, coroutine tools, and more to enhance KMP development."
            const val group = "io.github.tweener"
            const val packageUrl = "https://github.com/Tweener/KMPKit"
            const val gitUrl = "github.com:Tweener/KMPKit.git"

            object Developer {
                const val id = "Tweener"
                const val name = "Vivien Mahé"
                const val email = "vivien@tweener-labs.com"
            }
        }
    }

    object Compiler {
        val javaCompatibility = JavaVersion.VERSION_21
        val jvmTarget = javaCompatibility.toString()
    }
}
