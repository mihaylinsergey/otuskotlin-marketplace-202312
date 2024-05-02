rootProject.name = "ok-TaskTracker-be"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

pluginManagement {
    includeBuild("../build-plugin")
    plugins {
        id("build-jvm") apply false
        id("build-kmp") apply false
    }
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

include(":ok-TaskTracker-api-v1-jackson")
include(":ok-TaskTracker-common")
include(":ok-TaskTracker-api-v1-mappers")
include(":ok-TaskTracker-app-ktor")
include(":ok-TaskTracker-stubs")
include(":ok-TaskTracker-app-common")
include(":ok-TaskTracker-biz")
include(":ok-TaskTracker-api-log1")
include(":ok-TaskTracker-app-kafka")

