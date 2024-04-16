plugins {
    id("java")
    id("application")
    id ("org.openjfx.javafxplugin") version ("0.0.13")
}

group = "cs.edu.bsu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.openjfx:javafx-controls:13.0.2")

}



tasks.test {
    useJUnitPlatform()
}

javafx {
    version = "13.0.2"
    modules("javafx.fxml","javafx.controls")

}

application{
    mainClass.set("cs.edu.bsu.GUI")
}
