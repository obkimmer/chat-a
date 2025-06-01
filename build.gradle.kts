pluginManagement {
    repositories {
        gradlePluginPortal()
        google() // This must come before mavenCentral for AGP
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
