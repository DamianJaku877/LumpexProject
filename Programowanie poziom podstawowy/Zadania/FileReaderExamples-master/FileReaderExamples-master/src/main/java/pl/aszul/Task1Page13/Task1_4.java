package pl.aszul.Task1Page13;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1_4 {

    public static void main( String[] args ) throws IOException {
        File file = new File(".//src//main//resources//users.txt");
        List<User> usersFemale = new ArrayList<User>();
        List<User> usersMale = new ArrayList<User>();

        LineIterator fileContents = FileUtils.lineIterator(file, "UTF-8");
        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");
            if (Integer.parseInt(line[2]) >= 18){
                if (StringUtils.right(line[0], 1).equals("a")){
                    usersFemale.add(new User(line[0], line[1], Integer.parseInt(line[2])));
                } else {
                    usersMale.add(new User(line[0], line[1], Integer.parseInt(line[2])));
                }
            }
        }
        System.out.println("Kobiety: ");
        for (User user : usersFemale)
            System.out.println(user);
        System.out.println("Mężczyzni: ");
        for (User user : usersMale)
            System.out.println(user);
    }
}
