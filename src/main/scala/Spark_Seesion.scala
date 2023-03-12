import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Spark_Seesion {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf()
    sparkConf.setAppName("Second Spark Application")
    sparkConf.setMaster("local")
    val sc = new SparkContext(sparkConf)
    val array = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val arrarRDD = sc.parallelize(array, 2)
    println("Num of element in RDD", arrarRDD.count())
    arrarRDD.foreach(println)
  }
}
