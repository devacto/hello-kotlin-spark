package sample

import org.apache.spark.sql.SparkSession


fun main(args: Array<String>) {
    val sparkSession = SparkSession.builder().master("local")
}