plugins {
    kotlin("jvm") version "1.8.20"
    id("jacoco");
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("org.jacoco:org.jacoco.core:0.8.7")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

jacoco {
    toolVersion = "0.8.7"
    this.reportsDir = file("$buildDir/reports/jacoco")
}

tasks {
    jacocoTestReport {
        reports {
            xml.setDestination(file("$buildDir/jacoco/jacoco.xml"))
            html.isEnabled = true
        }
    }
}