plugins {
    id("idea")
    id("application")
    id("io.github.krakowski.jextract") version "0.5.0"
}

group = "io.github.krakowski"
version = "1.0"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}

application {
    mainClass = "io.github.krakowski.NativeHelloWorld"
    applicationDefaultJvmArgs = listOf(
        "--enable-native-access=ALL-UNNAMED"
    )
}

tasks.jextract {

    header("${project.projectDir}/src/main/c/stdio.h") {

        // The library name
        libraries = listOf("stdc++")

        // The package under which all source files will be generated
        targetPackage = "org.unix"

        // The generated class name
        className = "Linux"

        // Whitelist of functions
        functions = listOf("printf")
    }
}

tasks.wrapper {
    gradleVersion = "8.6"
}
