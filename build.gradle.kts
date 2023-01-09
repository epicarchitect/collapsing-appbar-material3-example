plugins {
    id("com.android.application") version "8.0.0-alpha11"
    id("org.jetbrains.kotlin.android") version "1.7.21"
}

android {
    namespace = "epicarchitect.collapsing.appbar.material3.example"
    compileSdk = 33

    defaultConfig {
        applicationId = "epicarchitect.collapsing.appbar.material3.example"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.7.0")
}