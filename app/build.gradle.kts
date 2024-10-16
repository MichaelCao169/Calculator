plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.calc1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.calc1"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)          // Core KTX
    implementation(libs.androidx.appcompat)          // AppCompat
    implementation(libs.material)                     // Material Components
    implementation(libs.androidx.activity)            // Activity KTX
    implementation(libs.androidx.constraintlayout)   // Constraint Layout
    testImplementation(libs.junit)                    // JUnit
    androidTestImplementation(libs.androidx.junit)    // AndroidX JUnit
    androidTestImplementation(libs.androidx.espresso.core) // Espresso
}
