plugins {
    java
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Driver JDBC do PostgreSQL (confira a versão mais recente no Maven Central)
    implementation("org.postgresql:postgresql:42.7.4")
}

// Mantém sua estrutura atual (src/ direto), sem precisar mover arquivos
sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }
}

application {
    mainClass.set("Main")   // sua classe Main está no pacote padrão
}