plugins {
    kotlin("jvm") version "1.9.21"
}

group = "de.felixroske"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}