import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("java")
}

description = "Example - Integration Tests"

dependencies {
    "testImplementation"(project(":aem:common"))
    "testImplementation"(project(":aem:sites"))
}

tasks {
    named<Jar>(JavaPlugin.JAR_TASK_NAME) {
        enabled = false
    }

    named<Test>(JavaPlugin.TEST_TASK_NAME) {
        testLogging {
            showStandardStreams = true
            events = setOf(TestLogEvent.PASSED, TestLogEvent.FAILED, TestLogEvent.SKIPPED)
        }
    }
}
