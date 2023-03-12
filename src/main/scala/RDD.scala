import org.apache.spark.sql.SparkSession
object RDD {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder.appName("Simple Application").master(master = "local[*]").getOrCreate()
//    val logData = spark.read.textFile(logFile).cache()
val rdd = spark.sparkContext.range(1, 5)
    rdd.collect().foreach(println)
  }
}

