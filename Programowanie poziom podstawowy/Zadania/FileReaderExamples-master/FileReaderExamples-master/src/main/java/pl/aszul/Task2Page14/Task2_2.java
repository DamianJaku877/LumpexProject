package pl.aszul.Task2Page14;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task2_2 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//weather-data.csv");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date [dd/mm/yyyy]: ");
        String userDate = sc.next();

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        fileContents.nextLine();
        while (fileContents.hasNext()) {
            String line = fileContents.nextLine();
            if (line.startsWith(userDate)){
                String[] meteoData = line.split(",");

                System.out.println("Max temperature: " + Byte.valueOf(meteoData[1]) +
                        ", Mean temperature: " + Byte.valueOf(meteoData[2]) +
                        ", Min temperature: " + Byte.valueOf(meteoData[3]));
                break;
            }
        }
    }
}
