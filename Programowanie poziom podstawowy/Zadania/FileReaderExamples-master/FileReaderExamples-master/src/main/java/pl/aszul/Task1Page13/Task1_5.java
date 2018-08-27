package pl.aszul.Task1Page13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task1_5 {

    public static void main( String[] args ) throws IOException {
        File file = new File(".//src//main//resources//books.csv");
        List<Book> books = new ArrayList<>();

        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");
        fileContents.nextLine();
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
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
