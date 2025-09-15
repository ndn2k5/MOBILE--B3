/*
 * Copyright (c) 2025 Pham The Minh
 * All rights reserved.
 * Project: USTH Weather
 * File: build.gradle.kts
 * Last Modified: 15/9/2025 10:15
 */

plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "vn.edu.usth.usthweather"
    compileSdk = 36

    defaultConfig {
        applicationId = "vn.edu.usth.usthweather"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}