/*
 * Copyright (c) 2022 Matthias Geisler (bitPogo) / All rights reserved.
 *
 * Use of this source code is governed by Apache v2.0
 */

package tech.antibytes.kmock.example.dependency

object Version {

    val gradle = Gradle

    object Gradle {
        /**
         * [AnitBytes GradlePlugins](https://github.com/bitPogo/gradle-plugins)
         */
        const val antibytes = "3f8244b"

        /**
         * [Spotless](https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless)
         */
        const val spotless = "6.4.2"
    }

    val antibytes = Antibytes

    object Antibytes {
        const val test = "7008207"

        /**
         * [KMock](https://github.com/bitPogo/kmock)
         */
        const val kmock = "0.1.1-SNAPSHOT"
    }

    val mockmp = MocKMP

    object MocKMP {
        /**
         * https://github.com/Kodein-Framework/MocKMP/releases
         */
        const val core = "1.4.0"
    }

    val mockative = Mockative

    object Mockative {
        /**
         * https://github.com/mockative/mockative/releases
         */
        const val core = "1.1.4"
    }

    val google = Google

    object Google {
        /**
         * [KSP](https://github.com/google/ksp)
         */
        /**
         * [KSP DevTools on MavenCentral](https://mvnrepository.com/artifact/com.google.devtools.ksp/com.google.devtools.ksp.gradle.plugin)
         */
        const val ksp = "1.6.10-1.0.4"
    }
}
