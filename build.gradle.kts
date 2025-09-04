plugins {
    kotlin("jvm") version "2.2.0"
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://central.sonatype.com/repository/maven-snapshots/")
    }
}

dependencies {
    // cql-to-elm-jvm also works
    api("info.cqframework:cql-to-elm:4.0.0-SNAPSHOT")

    api("info.cqframework:quick:4.0.0-SNAPSHOT")
    api("info.cqframework:ucum:4.0.0-SNAPSHOT")
}

kotlin {
    jvmToolchain(17)
}
