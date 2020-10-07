package ru.icmit.oodb.dz.lab2;


import com.google.gson.Gson;
import ru.icmit.oodb.dz.lab2.dops.Person;

import java.io.*;
import java.util.List;

public class SaveDB {

    public static void savePersonList(List<Person> persons) throws IOException {

        if (persons != null && persons.size() > 0) {
            Gson gson = new Gson();
            persons = PersonService.sortPersonByName(persons);
            String personsAsJson = gson.toJson(persons);


            System.out.println(personsAsJson);

            try (OutputStream os = new FileOutputStream(new File("persons.json"))) {
                os.write(personsAsJson.getBytes("UTF-8"));
                os.flush();
            }

        }
    }
}
