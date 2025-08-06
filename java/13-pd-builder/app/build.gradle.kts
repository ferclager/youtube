plugins {
    java
    idea
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation("org.assertj:assertj-core:3.26.3")
}

tasks.named<Test>("test") {
    useJUnitPlatform()

    afterTest(KotlinClosure2({ descriptor: TestDescriptor, result: TestResult ->
        val testRegex = ".*((_problema)|(nivel\\d+)|(oscuro\\d+))\\.PersonaTest".toRegex()
        if (!descriptor.className!!.matches(testRegex)) {
            println("[${descriptor.className}] > ${descriptor.displayName}: ${result.resultType}")
            return@KotlinClosure2
        }
        val problemOrLevel = testRegex.find(descriptor.className!!)!!.groupValues[1]
        var personType = ""
        if (problemOrLevel == "_problema") { //_problema o el-problema
            personType = "Persona"
        } else if (problemOrLevel.startsWith("nivel")) {
            personType = "Nivel ${problemOrLevel.substring("nivel".length)}"
        } else if (problemOrLevel.startsWith("oscuro")) {
            personType = "Lado Oscuro... nivel ${problemOrLevel.substring("oscuro".length)}"
        } else {
            throw IllegalStateException("Unexpected test class name: ${descriptor.className}")
        }
        println("[$personType] > ${descriptor.displayName}: ${result.resultType}")
    }))
}
