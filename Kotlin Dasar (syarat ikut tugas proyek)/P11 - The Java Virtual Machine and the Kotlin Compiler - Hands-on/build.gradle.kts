plugins {
    // Perbarui versi Kotlin ke 2.0.21 untuk kompatibilitas dengan Gradle 8.x / 9.x
    // Ini menghilangkan warning 'java-api-jars' dan 'java-runtime-jars'
    kotlin("jvm") version "2.0.21" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    // Mengatur target JVM agar konsisten di seluruh modul
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
}