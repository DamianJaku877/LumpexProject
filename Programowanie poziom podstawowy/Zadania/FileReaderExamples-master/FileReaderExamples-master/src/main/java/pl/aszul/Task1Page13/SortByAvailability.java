package pl.aszul.Task1Page13;

import java.util.Comparator;

public class SortByAvailability implements Comparator<Book> {

    public int compare(Book a, Book b)
        {
        return Boolean.compare(a.isInStock(), b.isInStock());
        }
}