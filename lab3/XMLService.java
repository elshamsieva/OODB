package ru.icmit.oodb.dz.lab3;

import ru.icmit.oodb.dz.lab3.main.Metro;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;


public class XMLService {


    public static void saveTravelCardData(Metro metro) {

        try {
            JAXBContext context = JAXBContext.newInstance(Metro.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);


            marshaller.marshal(metro, new File("metro.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }



    public static Metro loadCardFromXML() {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Metro.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Metro) un.unmarshal(new File("metro.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}

