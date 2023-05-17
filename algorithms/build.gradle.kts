plugins {
    kotlin("jvm") version "1.8.21"
}

sourceSets.main {
    java.srcDirs("src/main/java", "src/main/kotlin")
}

group = "br.com.cvinicius"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.junit.jupiter:junit-jupiter-engine:5.9,2")
    implementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
}