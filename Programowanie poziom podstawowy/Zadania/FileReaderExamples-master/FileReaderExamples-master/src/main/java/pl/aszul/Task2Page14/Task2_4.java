package pl.aszul.Task2Page14;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2_4 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//weather-data.csv");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter threshold temperature [°C]: ");
        int thresholdTemp = sc.nextInt();

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        fileContents.nextLine();
        int warmDaysCounter = 0;
        while (fileContents.hasNext()) {
            String line = fileContents.nextLine();
            if (line.matches("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4},[-0-9]{1,3},[-0-9]{1,3},[-0-9]{1,3}$"))
                if (Integer.parseInt(line.split(",")[2]) >= thresholdTemp)
                    warmDaysCounter++;
        }
        System.out.println("There were " + warmDaysCounter + " days with at least " + thresholdTemp + "°C");
    }
}
