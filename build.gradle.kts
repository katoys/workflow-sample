import io.github.katoys.version.incrementer.semantic.SemanticVersioning

plugins {
    id("io.github.katoys.version-incrementer") version "1.1.1"
}

group = "io.github.katoys"
version = SemanticVersioning(project.rootDir.resolve("version.yml").path).current().value
