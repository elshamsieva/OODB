package ru.icmit.oodb.dz.lab2;

import ru.icmit.oodb.dz.lab2.dops.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


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
    public static List<Person> sortPersonByName(List<Person> list){
        List<Person> result = list
                .stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        return result;
    }


}

