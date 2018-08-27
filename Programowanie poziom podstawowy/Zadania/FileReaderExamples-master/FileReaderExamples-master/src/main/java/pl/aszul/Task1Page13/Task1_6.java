package pl.aszul.Task1Page13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task1_6 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//books.csv");
        List<Book> books = new ArrayList<>();

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        String header = fileContents.nextLine();
        while (fileContents.hasNext())
            books.add(new Book(fileContents.nextLine()));

        System.out.println("Before sorting : ");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

        Collections.sort(books, new SortByPrice());
        Collections.sort(books, new SortByAvailability());
        System.out.println("After sorting : ");
        iterator = books.iterator();
        File sortedFile = new File(".//src//main//resources//sortedBooks.csv");
        FileWriter fileWriter = new FileWriter(sortedFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write(header + "\n");
            while (iterator.hasNext()) {
                Book book = iterator.next();
                System.out.println(book);
                bufferedWriter.write(book.toStringCSV() + "\n");
            }
        } finally {
            bufferedWriter.close();
        }
    }
}
