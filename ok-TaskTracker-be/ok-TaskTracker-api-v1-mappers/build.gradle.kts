plugins {
    id("build-jvm")
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":ok-TaskTracker-api-v1-jackson"))
    implementation(project(":ok-TaskTracker-common"))

    testImplementation(kotlin("test-junit"))
}
