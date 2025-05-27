dependencies {
    compileOnly(rootProject.libs.kotlin.stdlib)
    compileOnly(rootProject.libs.kotlin.reflect)
    compileOnly(rootProject.libs.kotlin.coroutines)
    compileOnly(rootProject.libs.simplecloud.controller) {
        exclude(group = "org.jetbrains.kotlin")
        exclude(group = "org.jetbrains.kotlinx")
    }
    compileOnly(rootProject.libs.simplecloud.player) {
        exclude(group = "net.kyori")
        exclude(group = "org.jetbrains.kotlin")
        exclude(group = "org.jetbrains.kotlinx")
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

kotlin {
    jvmToolchain(8)
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_1_8)
        jvmTarget.set(JvmTarget.JVM_1_8)
    }
}