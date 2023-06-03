plugins {
    kotlin("jvm") version "1.8.21"
}

group = "me.d151l.displayname"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven ("https://repo.thesimplecloud.eu/artifactory/list/gradle-release-local/")
}

dependencies {
    compileOnly ("eu.thesimplecloud.simplecloud:simplecloud-api:2.4.1")
    compileOnly ("eu.thesimplecloud.simplecloud:simplecloud-base:2.4.1")
    compileOnly ("eu.thesimplecloud.simplecloud:simplecloud-plugin:2.4.1")
    compileOnly ("eu.thesimplecloud.simplecloud:simplecloud-launcher:2.4.1")
}

kotlin {
    jvmToolchain(11)
}