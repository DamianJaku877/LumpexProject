package pl.aszul.Task1Page13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;


public class Task1_2 {

    public static void main( String[] args ) throws IOException {
        File file = new File(".//src//main//resources//simpleExample.txt");
        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");
        while (fileContents.hasNext())
            System.out.println(fileContents.nextLine());
    }
}
