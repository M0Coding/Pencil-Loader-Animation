plugins {
    id ("com.android.application") version "7.3.1" apply false
    id ("com.android.library") version "7.3.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id ("io.github.gradle-nexus.publish-plugin") version "1.1.0"
    id ("org.jetbrains.dokka") version "1.7.20"
    id ("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.12.1"
}

apply(from ="${rootDir}/scripts/publish-root.gradle")