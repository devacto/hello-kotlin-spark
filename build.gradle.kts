plugins {
    application
    kotlin("jvm") version "1.3.0"
}

application {
    mainClassName = "codes.victor.kafka.connect.GraphQLServerKt"
}

dependencies {
    compile(kotlin("stdlib"))
    compile(group = "org.apache.kafka", name = "connect-api", version = "2.0.0")
    compile(group = "org.slf4j", name = "slf4j-log4j12", version = "1.7.25")
    compile(group = "com.mashape.unirest", name = "unirest-java", version = "1.4.9")
}

repositories {
    jcenter()
}