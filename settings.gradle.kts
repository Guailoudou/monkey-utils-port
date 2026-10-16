pluginManagement {
	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven("https://maven.fabricmc.net/") { name = "Fabric" }
	}
}

dependencyResolutionManagement {
	repositories {
		mavenLocal()
		mavenCentral()
		maven("https://maven.fabricmc.net/")
		maven("https://api.modrinth.com/maven")
	}
}