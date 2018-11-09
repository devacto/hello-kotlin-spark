package sample

import org.apache.spark.sql.SparkSession

fun main(args: Array<String>) {
    val sparkSession = SparkSession.builder()
            .master("local")
            .appName("rr-processor")
            .config("spark.driver.extraJavaOptions", "-Djava.net.userSystemProxies=true")
            .config("spark.sql.parquet.binaryAsString", "true")
            .orCreate

    val sparkContext = sparkSession.sparkContext()

    println("Spark version: ${sparkContext.version()}")
    println("Spark master:  ${sparkContext.master()}")
    println("Spark running locally: ${sparkContext.isLocal}")
    println("Default parallelism: ${sparkContext.defaultParallelism()}")

    sparkSession.close()
}