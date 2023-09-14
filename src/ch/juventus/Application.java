package ch.juventus;

import ch.juventus.entity.Address;
import ch.juventus.entity.Person;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Address address = new Address("Bahnhofstrasse", 1, "Zürich", "8001");
        Person person = new Person("Hans", "Muster", 42, true);
        System.out.println(person);
        System.out.println(address);
    }
}
