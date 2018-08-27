package Dekorator;

public class Person implements PersonInfo {
    String lastName;
    int id;

    public Person(String lastName, int id) {
        this.lastName = lastName;
        this.id = id;
    }

    @Override
    public void displayAllInfo() {
        System.out.print( id + lastName);
    }
}
