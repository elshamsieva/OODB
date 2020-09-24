package ru.icmit.oodb.dz.lab3;

import ru.icmit.oodb.dz.lab3.main.Metro;


public class MainLoad {

    public static void main(String[] args) {

        Metro metro = XMLService.loadCardFromXML();

        System.out.println(metro);
    }
}
