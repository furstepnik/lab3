package bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class AirportApp {
    private static final String FLIGHTS_FILE = "664600583_T_ONTIME_sample.csv";
    private static final String AIRPORT_FILE = "L_AIRPORT_ID.csv";
    private static final String SEPARATOR = ",";
    private static final int ID_INDEX = 0;
    private static final int AIRPORT_NAME_INDEX = 1;

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AirportApp");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> flightsInput = sc.textFile(FLIGHTS_FILE);
        JavaRDD<String> airportInput = sc.textFile(AIRPORT_FILE);

        JavaPairRDD<String, String> airportsMap = airportInput.mapToPair(row -> {
            String[] column = row.split(SEPARATOR);
            String airportName = column[AIRPORT_NAME_INDEX];
            String airportID = column[ID_INDEX];
        });

        JavaPairRDD<Tuple2<String. String>, >




    }
}
