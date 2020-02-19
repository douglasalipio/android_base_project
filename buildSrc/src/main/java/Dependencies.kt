object PluginDependencies {
    val gradle = "com.android.tools.build:gradle:${Versions.gradleAndroidPlugin}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object ProjectDependencies {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"

    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val androidX = "androidx.core:core-ktx:${Versions.androidX}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constrantLayout}"

}

object ProjectModules {
    val data = ":data"
    val domain = ":domain"
}

object Versions {
    val gradleAndroidPlugin = "3.5.3"

    val compileSdk = 29
    val targetSdk = 29
    val minSdkVersion = 21
    val releaseVersionCode = 1
    val releaseVersionName = "1.0.0"

    val kotlin = "1.3.61"
    val ktlint = "0.20.0"

    val appcompat = "1.1.0"
    val androidX = "1.1.0"
    val constrantLayout = "1.1.3"
}