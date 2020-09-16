package ru.icmit.oodb.dz.lab2;

import ru.icmit.oodb.dz.lab1.Person;
import java.util.List;


public class PersonService {


    public static Person findPersonByName(List<Person> persons, String searchName) {
        Person result = null;

        for (Person person : persons) {
            if (person.getFirstName().equals(searchName)) {
                result = person;
            }
        }

        return result;
    }

}

