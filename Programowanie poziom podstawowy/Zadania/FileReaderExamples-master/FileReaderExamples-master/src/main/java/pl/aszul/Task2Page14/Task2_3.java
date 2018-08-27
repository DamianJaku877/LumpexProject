package pl.aszul.Task2Page14;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task2_3 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//weather-data.csv");

        Scanner sc = new Scanner(System.in);
        LocalDate userDateStart = null;
        System.out.println("Enter start date [dd/mm/yyyy]: ");
        do {
            try {
                userDateStart = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("d/M/yyyy"));
                System.out.println(userDateStart);
            } catch (DateTimeParseException ex) {
                System.out.println("Don't be so stupid, just enter start date [dd/mm/yyyy]: ");
            }
        } while(userDateStart == null);

        LocalDate userDateEnd = null;
        System.out.println("Enter end date [dd/mm/yyyy]: ");
        do {
            try {
                userDateEnd = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("d/M/yyyy"));
            } catch(DateTimeParseException ex) {
                System.out.println("Don't be so stupid, just enter end date [dd/mm/yyyy]: ");
            }
        } while(userDateEnd == null || userDateEnd.isBefore(userDateStart) || userDateEnd.isEqual(userDateStart));

        int lineCounter = 0;
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        int avgTemp = 0;
        int inputMinTemp;
        int inputMaxTemp;
        int inputAvgTemp;
        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        fileContents.nextLine();
        while (fileContents.hasNext()) {
            String inputLine = fileContents.nextLine();
            String[] inputLineAsArray = inputLine.split(",");
            LocalDate inputDate = LocalDate.parse(inputLineAsArray[0], DateTimeFormatter.ofPattern("M/d/yyyy"));

            if ((inputDate.isAfter(userDateStart) || inputDate.isEqual(userDateStart)) &&
                    inputLine.matches("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4},[-0-9]{1,3},[-0-9]{1,3},[-0-9]{1,3}?")){
                if (inputDate.isAfter(userDateEnd))
                    break;
                lineCounter++;
                inputMinTemp = Integer.parseInt(inputLineAsArray[3]);
                inputAvgTemp = Integer.parseInt(inputLineAsArray[2]);
                inputMaxTemp = Integer.parseInt(inputLineAsArray[1]);
                if (inputMinTemp < minTemp)
                    minTemp = inputMinTemp;
                if (inputMaxTemp > maxTemp)
                    maxTemp = inputMaxTemp;
                avgTemp += inputAvgTemp;
            }
        }
        if (lineCounter > 0) {
            System.out.println("Max temperature: " + maxTemp +
                    "°C, Min temperature: " + minTemp +
                    "°C, Mean temperature: " + (avgTemp / lineCounter) + ", Number of samples: " + lineCounter);
        } else {
            System.out.println("Specified period not included in provided meteo data!!!");
        }
    }
}
