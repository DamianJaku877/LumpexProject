package pl.aszul.Task2Page14;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2_5 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//weather-data.csv");

        PeriodsStatistics years = new PeriodsStatistics();
        PeriodsStatistics months = new PeriodsStatistics();
        PeriodsStatistics days = new PeriodsStatistics();

        String[] lineAsArray;
        LocalDate lineDate;
        int lineAvgTemperature;

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        fileContents.nextLine();
        while (fileContents.hasNext()) {
            String line = fileContents.nextLine();
            if (line.matches("^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4},-?[0-9]{1,2},-?[0-9]{1,2},-?[0-9]{1,2}$")){
                lineAsArray = line.split(",");
                lineDate = LocalDate.parse(lineAsArray[0], DateTimeFormatter.ofPattern("M/d/yyyy"));
                lineAvgTemperature = Integer.parseInt(lineAsArray[2]);

                years.addPeriod(lineDate.getYear(), lineAvgTemperature);
                months.addPeriod(lineDate.getMonthValue(), lineAvgTemperature);
                days.addPeriod(lineDate.getDayOfYear(), lineAvgTemperature);
            }
        }
        System.out.println(years.getSummary("year"));
        System.out.println(months.getSummary("month"));
        System.out.println(days.getSummary("day"));
    }
}
