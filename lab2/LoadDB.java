package ru.icmit.oodb.dz.lab2;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ru.icmit.oodb.dz.lab2.dops.Person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class LoadDB  {




    public static List<Person> loadPersonList() throws IOException, JsonSyntaxException {
        String pStr = "";
        File file = new File("persons.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }

        Gson gson = new Gson();


        Person[] plst = gson.fromJson(pStr, Person[].class);

        return Arrays.asList(plst);


    }








}
