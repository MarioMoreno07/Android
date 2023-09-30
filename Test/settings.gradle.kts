pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Test"
include(":app")
include(":app:linearlayout")
include(":linearlayout")
include(":ejercicio1_2")
include(":ejercicio1_3")
