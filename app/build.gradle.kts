plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.english.pdf"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.english.pdf"
        minSdk = 28
        targetSdk = 34
        versionCode = 4
        versionName = "1.1.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    signingConfigs {
        create("release") {
            file("../buildsystem/key_store.jks")
            storePassword = "Sh01202991861()=>{};"
            keyAlias = "english_pdf"
            keyPassword = "Sh01202991861()=>{};"
            storeFile = file("../buildsystem/key_store.jks")
            enableV1Signing = false
            enableV2Signing = false
            enableV3Signing  = true
            enableV4Signing  = true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
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

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
//    implementation ("org.koin:koin-android:2.0.1")
//    implementation ("org.koin:koin-androidx-scope:2.0.1")
//    implementation ("org.koin:koin-androidx-viewmodel:2.0.1")
//    implementation ("org.koin:koin-androidx-ext:2.0.1")
//    implementation ("org.koin:koin-java:2.0.1")
//    implementation ("org.koin:koin-test:2.0.1")

    // implementation "io.insert-koin:koin-androidx-scope:3.5.0"

    // Keep only the necessary dependencies
    implementation("io.insert-koin:koin-android:3.5.0")

}