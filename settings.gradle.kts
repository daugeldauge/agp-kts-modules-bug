pluginManagement {

    repositories {
        jcenter()
        google()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("com.android")) {
                useModule("com.android.tools.build:gradle:4.1.0-alpha06")
            }
        }
    }
}

include("app")
include("lib")
