plugins {
    id("dev.kikugie.stonecutter")
}
stonecutter active "1.21.1-fabric"

stonecutter registerChiseled tasks.register("chiseledBuild", stonecutter.chiseled) { 
    group = "project"
    ofTask("build")
}

/*
*     exclusiveContent {
        forRepository {
            maven {
                name "FiguraMC"
                url "https://maven.figuramc.org/releases"
            }
        }

        filter {
            includeGroup "org.figuramc"
        }
    }
    maven { url 'https://jitpack.io' }
* */

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://maven.neoforged.net/releases")
        maven("https://maven.fabricmc.net/")
//        maven("https://maven.figuramc.org/releases")
        // 0.1.6 isnt on the official maven yet
        maven("https://penguinencounter.github.io/mvn/snapshots")
        maven("https://jitpack.io")

    }
}