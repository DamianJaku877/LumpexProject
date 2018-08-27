package pl.aszul.Task4Page16;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Map;

import static pl.aszul.Task4Page16.Config.LINE_PATTERN;
import static pl.aszul.Task4Page16.Config.RED;
import static pl.aszul.Task4Page16.Config.RESET;

public class Task4 {
    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//flights.csv");

        String line;
        String[] lineAsArray;
        int passengers;
        int totalPassengersCount = 0;
        PeriodsStatistics years = new PeriodsStatistics();
        PeriodsStatistics months = new PeriodsStatistics();
        PeriodsStatistics monthsCombined = new PeriodsStatistics();

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        int lineCounter = 0;
        while (fileContents.hasNext()) {
            line = fileContents.nextLine();
            lineCounter++;
            if (line.matches(LINE_PATTERN)){
                lineAsArray = line.split(",");
                if (!lineAsArray[0].equals("year")) {
                    passengers = Integer.parseInt(lineAsArray[2]);
                    totalPassengersCount += passengers;

                    years.addPeriod(LocalDate.parse("January/1/" + lineAsArray[0],
                        DateTimeFormatter.ofPattern("MMMM/d/yyyy", Locale.ENGLISH)), passengers);

                    months.addPeriod(LocalDate.parse(lineAsArray[1] + "/1/" + lineAsArray[0],
                        DateTimeFormatter.ofPattern("MMMM/d/yyyy", Locale.ENGLISH)), passengers);

                    monthsCombined.addPeriod(LocalDate.parse(lineAsArray[1] + "/1/2000",
                        DateTimeFormatter.ofPattern("MMMM/d/yyyy", Locale.ENGLISH)), passengers);
                }
            } else {
                System.out.printf("%d   %s", lineCounter, line + RED + "INCORRECT SYNTAX!!!" + RESET);
            }
        }
        System.out.printf("1. Total passengers count : %d\n", totalPassengersCount);

        System.out.printf("2. Peak month in the year : %d [%d passengers], worst month in the year : %d [%d passengers]\n",
            monthsCombined.getMax().getKey().getMonthValue(), monthsCombined.getMax().getValue(),
            monthsCombined.getMin().getKey().getMonthValue(), monthsCombined.getMin().getValue());

        System.out.printf("3. Peak year : %d [%d passengers], worst year : %d [%d passengers]\n",
                years.getMax().getKey().getYear(), years.getMax().getValue(),
                years.getMin().getKey().getYear(), years.getMin().getValue());

        System.out.printf("4. Best month in all history : %d/%d [%d passengers], worst month in all history : %d/%d [%d passengers]\n",
            months.getMax().getKey().getYear(), months.getMax().getKey().getMonthValue(), months.getMax().getValue(),
            months.getMin().getKey().getYear(), months.getMax().getKey().getMonthValue(), months.getMin().getValue());

        System.out.println("5. Year to year relative passengers change:");
        years.getSummaryChronologically();
        int prevYearPassengers = 0;
        int year2YearRatio;
        for (Map.Entry<LocalDate, Integer> year : years.getSummaryChronologically()) {
            if (prevYearPassengers != 0){
                year2YearRatio = 100 * (year.getValue() - prevYearPassengers) / prevYearPassengers;
                System.out.printf("%d %s%%\n", year.getKey().getYear(), year2YearRatio > 0 ? "+" + year2YearRatio : year2YearRatio);
            }
            prevYearPassengers = year.getValue();
        }
    }
}
