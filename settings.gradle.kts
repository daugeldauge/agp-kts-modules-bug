pluginManagement {

    repositories {
        jcenter()
        google()
    }

    resolutionStrategy {
        eachPlugin {
            val id = requested.id.id
            when {
                id.startsWith("com.android") -> useModule("com.android.tools.build:gradle:4.1.0-alpha06")
                id == "kotlin-android" -> useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.71")
            }
        }
    }
}

include("app")
include("lib")
