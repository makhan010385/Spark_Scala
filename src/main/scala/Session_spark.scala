/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession
object Session_spark
{
  def main(args: Array[String])
  {

    val logFile = "C:\\Users\\Makhan\\Desktop\\mk.txt" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").master(master = "local[*]").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("m")).count()
    val numBs = logData.filter(line => line.contains("k")).count()
    println(s"Lines with m: $numAs, Lines with k: $numBs")
    spark.stop()
  }
}
