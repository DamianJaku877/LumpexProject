package pl.aszul.Task3Page15;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

import static pl.aszul.Task3Page15.Config.LINE_PATTERN;
import static pl.aszul.Task3Page15.Config.GREEN;
import static pl.aszul.Task3Page15.Config.RED;
import static pl.aszul.Task3Page15.Config.RESET;

public class Task3_1 {

    public static void main( String[] args ) throws IOException {
        File inputFile = new File(".//src//main//resources//userActions.csv");

        String line;
        String[] lineAsArray;
        Commands command;
        String login;
        UserService users = new UserService();

        LineIterator fileContents = FileUtils.lineIterator(inputFile, "UTF-8");
        int lineCounter = 0;
        while (fileContents.hasNext()) {
            line = fileContents.nextLine();
            lineCounter++;
            if (line.matches(LINE_PATTERN)){
                lineAsArray = line.split(";", -6);
                command = Commands.matchCommand(lineAsArray[0].toUpperCase());
                login = lineAsArray[1];
                switch (command){
                    case ACTION:
                        break;
                    case CREATE:
                        System.out.printf("%d   %s%s\n", lineCounter, line,
                                (users.addUser(login, lineAsArray[2], lineAsArray[3], lineAsArray[4], lineAsArray[5]) ?
                                        GREEN + "OK (user " + login + " created)" : RED + "FAILED") + RESET);
                        break;
                    case UPDATE:
                        System.out.printf("%d   %s%s\n", lineCounter, line,
                                (users.updateUser(login, lineAsArray[2], lineAsArray[3], lineAsArray[4], lineAsArray[5]) ?
                                GREEN + "OK (user " + login + " updated)" : RED + "FAILED") + RESET);
                        break;
                    case REMOVE:
                        System.out.printf("%d   %s%s\n", lineCounter, line,
                                (users.removeUser(login) ?
                                GREEN + "OK (user " + login + " removed)" : RED + "FAILED") + RESET);
                        break;
                    case UNKNOWN:
                        System.out.printf("%d   %s%s\n", lineCounter, line,
                                RED + "FAIL (unknown command)" + RESET);
                        break;
                }
            } else {
                System.out.printf("%d   %s%s\n", lineCounter, line, RED + "INCORRECT SYNTAX!!!" + RESET);
            }
        }
        System.out.println("\nUsers database after updates:\n" + users);
    }
}
