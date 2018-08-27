package pl.aszul.Task1Page13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1_3 {

    public static void main( String[] args ) throws IOException {
        File file = new File(".//src//main//resources//users.txt");
        List<User> users = new ArrayList<User>();
        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");
        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");
            users.add(new User(line[0], line[1], Integer.parseInt(line[2])));
        }
        for (User user : users)
            System.out.println(user);
    }
}
