package com.FileOperation1;

/*  1.  Dodaj do projektu plik weather-data.csv. Zawiera on informacje pogodowe z jednej stacji
        meteorologicznej na przestrzeni prawie 70 lat (25 tysięcy rekordów).
    2.  Napisz program który pobierze od użytkownika datę i zwróci minimalną, średnią i
        maksymalną temperaturę tego dnia. Spróbuj zoptymalizować swój algorytm.*/

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException, ParseException {

        String stringData = "11/25/2015";
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = format.parse(stringData);

        File weatherFile = new File("D:\\Programowanie\\Kurs JAVA\\Programowanie poziom podstawowy\\Zadania\\ObsługaPliku\\Weather-data\\src\\main\\resources\\weather-data.csv");
        List<Weather> weathers = new ArrayList<Weather>();

        LineIterator weatherFileContents = FileUtils.lineIterator(weatherFile, "UTF-8");
        weatherFileContents.next();

        while(weatherFileContents.hasNext()){

            String[] line = weatherFileContents.nextLine().split(",");

            Date lineDate = format.parse(line[0]);
            int max = new Integer(line[1]);
            int mean = new Integer(line[2]);
            int min = new Integer(line[3]);

            weathers.add(new Weather(lineDate,max,mean,min));
        }
        for(Weather weather: weathers){
            System.out.println(weather);
        }

    }
}

/*
/*Date date = dt.parse(date_s);
  SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd")

    List<Book> books = new ArrayList<Book>();
    LineIterator bookFileContents = FileUtils.lineIterator(bookFile, "UTF-8");
        bookFileContents.next();

                while(bookFileContents.hasNext()){

                String[] line = bookFileContents.nextLine().split(",");

                float price = Float.parseFloat(line[3]);
                boolean inStock = new Boolean(line[4]);
                int sequence = new Integer(line[7]);
                books.add(new Book(line[0],line[1],line[2],price,inStock,line[5],line[6],sequence,line[8]));*/
