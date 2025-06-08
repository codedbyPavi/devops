plugins {
    `java-library`
    `maven-publish`
    application
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

group = "com.yashu"
version = "1.0-SNAPSHOT"
description = "devop-4pg"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

application {
    mainClass.set("com.yashu.App")
}
