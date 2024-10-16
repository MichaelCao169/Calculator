pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        // Specify the version for the Android Gradle Plugin
        id("com.android.application") version "8.6.0-alpha07" apply false
        id("org.jetbrains.kotlin.android") version "1.7.10" apply false // Use your desired Kotlin version
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "michaelcao"
include(":app")
