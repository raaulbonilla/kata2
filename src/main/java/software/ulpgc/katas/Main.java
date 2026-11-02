package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person ("Raúl", LocalDate.of(2006,9,26));
        System.out.println(person.age());
    }
}