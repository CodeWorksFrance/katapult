
plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    implementation("com.google.guava:guava:31.0.1-jre")
    testImplementation("org.assertj:assertj-core:3.23.1")
}


java.sourceCompatibility = JavaVersion.VERSION_17
tasks.named<Test>("test") {
    useJUnitPlatform()
}
