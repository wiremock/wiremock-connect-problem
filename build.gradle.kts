plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.34.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("io.projectreactor.netty:reactor-netty-http:1.0.23")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}