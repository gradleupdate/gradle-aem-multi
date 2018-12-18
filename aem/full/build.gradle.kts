import com.cognifide.gradle.aem.pkg.tasks.Compose

plugins {
    id("com.cognifide.aem.package")
}

description = "Example - AEM Full"

tasks {
    named<Compose>(Compose.NAME) {
        fromProject(":aem:app.common")
        fromProject(":aem:app.core")
        fromProject(":aem:app.config")
        fromProject(":aem:app.design")

        fromProject(":aem:content.demo")
        fromProject(":aem:content.init")
    }
}
