package bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class AirportApp {

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AirportApp");
        JavaSparkContext sc = new JavaSparkContext(conf);

    }
}
