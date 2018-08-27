package com.fileOperation;

import com.sun.deploy.util.StringUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
     1. Utwórz projekt FileReaderExamples w którym zaimplementujesz obsługę plików. Do
     utworzonego projektu dodaj katalog resources (po utworzeniu kliknij PPM na nazwę projektu,
     wybierz z menu Maven a następnie Reimport - ikona katalogu powinna się zmienić).

     2. Do katalogu resources dodaj plik simpleExample.txt i wyświetl jego zawartość w konsoli.

     3. Do katalogu resources dodaj plik users.txt Plik zawiera listę imion oraz nazwisk wraz z
        wiekiem. Utwórz obiekt User i utwórz listę obiektów z danymi z pliku.
*/
public class App 
{
    public static void main( String[] args ) throws IOException {

        File file = new File("D:\\Programowanie\\Kurs JAVA\\Programowanie poziom podstawowy\\Zadania\\ObsługaPliku\\FileReaderExaples\\src\\main\\resources\\simpleExample.txt");

        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, "UTF-8");

        System.out.println(str + "\n");
        System.out.println("---------------------------------------------------------------------");

        File file1 = new File("D:\\Programowanie\\Kurs JAVA\\Programowanie poziom podstawowy\\Zadania\\ObsługaPliku\\FileReaderExaples\\src\\main\\resources\\users.txt");
        List<User> users = new ArrayList<User>();

        LineIterator fileContents = FileUtils.lineIterator(file1, "UTF-8");

        while (fileContents.hasNext()) {
            String[] line = fileContents.nextLine().split(" ");
            int age = new Integer(line[2]);
            users.add(new User(line[0], line[1], age));
        }

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("------------------------------------------------------------------------\n");

        File file2 = new File("D:\\Programowanie\\Kurs JAVA\\Programowanie poziom podstawowy\\Zadania\\ObsługaPliku\\FileReaderExaples\\src\\main\\resources\\users.txt");

        List<User> femaleList = new ArrayList<User>();
        List<User> menList = new ArrayList<User>();

        LineIterator file2Contents = FileUtils.lineIterator(file2, "UTF-8");

        while (file2Contents.hasNext()) {
            String[] line = file2Contents.nextLine().split(" ");

            int age = new Integer(line[2]);
            String name = line[0];
            String lastName = line[1];

            if (age >= 18 && name.endsWith("a")) {
                User user = new User(name, lastName, age);
                femaleList.add(user);
            } else if (age >= 18) {
                User user = new User(name, lastName, age);
                menList.add(user);
            }
        }
        System.out.println("Vomen list: ");
        for (User vomen : femaleList) {
            System.out.println(vomen);
        }
        System.out.println("Men list:");
        for (User mens : menList) {
            System.out.println(mens);
        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("5. Wczytaj plik books.csv w którym znajduje się lista książek. Utwórz listę obiektów, posortuj\n"
                                + "według dostępności w magazynie i ceny. Na koniec wyświetl listę książek w konsoli.\n");

        File bookFile = new File("D:\\Programowanie\\Kurs JAVA\\Programowanie poziom podstawowy\\Zadania\\ObsługaPliku\\FileReaderExaples\\src\\main\\resources\\books.csv");

        List<Book> books = new ArrayList<Book>();
        LineIterator bookFileContents = FileUtils.lineIterator(bookFile, "UTF-8");
        bookFileContents.next();

        while(bookFileContents.hasNext()){

            String[] line = bookFileContents.nextLine().split(",");

            float price = Float.parseFloat(line[3]);
            boolean inStock = new Boolean(line[4]);
            int sequence = new Integer(line[7]);
            books.add(new Book(line[0],line[1],line[2],price,inStock,line[5],line[6],sequence,line[8]));
        }
        Collections.sort(books);
        for(Book bookList : books){
            System.out.println(bookList);
        }
    }
}
