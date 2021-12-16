package bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class AirportApp {
    private static final String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static final String AIRPORT_FILE = "L_AIRPORT_ID.csv";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AirportApp");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsInput = sc.textFile(FLIGHTS_FILE);
        JavaRDD<String> airportInput = sc.textFile(AIRPORT_FILE);

        




    }
}
