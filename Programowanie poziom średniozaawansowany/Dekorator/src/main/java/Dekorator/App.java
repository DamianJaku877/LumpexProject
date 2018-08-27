package Dekorator;

public class App 
{
    public static void main( String[] args )
    {
        Person person = new Person(" Jakubowski ", 001);
        ISO999Person iso999Person = new ISO999Person(person,"Damian",87020304831L);
        iso999Person.displayAllInfo();
    }
}
