package pl.aszul.Task1Page13;

import java.util.Comparator;

public class SortByPrice implements Comparator<Book> {

    public int compare(Book a, Book b)
        {
        return a.getPrice().compareTo(b.getPrice());
        }
}