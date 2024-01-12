plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.codeborne:selenide:7.0.4")
    testImplementation("org.testng:testng:7.9.0")

}

tasks.test {
    useTestNG()
}