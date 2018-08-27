package Dekorator;

public class ISO999Person implements PersonInfo {

    Person person;
    String firstName;
    long pesel;

    public ISO999Person(Person person, String firstName, long pesel) {
        this.person = person;
        this.firstName = firstName;
        this.pesel = pesel;
    }

    @Override
    public void displayAllInfo() {
        person.displayAllInfo();
        System.out.print(firstName + " " + pesel);
    }
}
