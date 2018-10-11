import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Author: Denis Zhenilov
 * This class contains the main() method for the program used to parse csv files. It takes a single command line argument,
 * and if it receives none or more it will print a usage statement.
 */

public class csvParserMain {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, java.sql.SQLException, IOException {
        if(args.length!=1){
            System.out.println("usage: csvParserMain.java <csv-file>");
            System.exit(0);
        }
        else {
            csvParser parser = new csvParser();
            parser.parseCsv(args[0]);
        }
    }
}
