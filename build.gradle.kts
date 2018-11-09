plugins {
    application
    kotlin("jvm") version "1.3.0"
}

application {
    mainClassName = "sample.ProcessorKt"
}

dependencies {
    compile(kotlin("stdlib"))
    compile(group = "org.apache.spark", name = "spark-sql_2.11", version = "2.4.0")
}

repositories {
    jcenter()
}