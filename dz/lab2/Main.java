package ru.icmit.oodb.dz.lab2;



import ru.icmit.oodb.dz.lab1.Person;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Person> persons = LoadDB.loadPersonList();

            persons.forEach(System.out::println);

            Person prs = PersonService.findPersonByName(persons, "Элина");

            if (prs != null) {
                prs.setPhoneNumber("+79372920330");

            }

            SaveDB.savePersonList(persons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
