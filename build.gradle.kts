buildscript {

    dependencies {
        classpath("com.android.tools.build:gradle:7.4.2")
    }
}
plugins {
    //trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.maven.publish) apply false
    alias(libs.plugins.kotlin.jvm) apply false
}
