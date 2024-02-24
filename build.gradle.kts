buildscript {

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("multiplatform").version("1.9.0").apply(false)
    id("com.vanniktech.maven.publish") version "0.25.2"
    id("org.jetbrains.kotlin.jvm") version "1.8.0" apply false
}
