package ru.icmit.oodb.dz.lab3;

import ru.icmit.oodb.dz.lab3.dops.Client;
import ru.icmit.oodb.dz.lab3.dops.Metro;
import ru.icmit.oodb.dz.lab3.dops.TravelCard;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;


public class XMLService {


    public static void saveTravelCardData(Metro metro) {


        try {
            StringWriter writer = new StringWriter();

            //создание объекта Marshaller, который выполняет сериализацию
            JAXBContext context = JAXBContext.newInstance(Metro.class, TravelCard.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // сама сериализация
            marshaller.marshal(metro, writer);

            //преобразовываем в строку все записанное в StringWriter
            String result = writer.toString();

            try (OutputStream os = new FileOutputStream(new File("metro.xml"))) {
                os.write(result.getBytes(StandardCharsets.UTF_8));
                os.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }



    public static Metro loadMetroFromXML() {

        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Metro.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Metro) un.unmarshal(new File("metro.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void searchByPrice(Metro metro, double balance) {
        for (Client client: metro.getClients()) {
            if (client.getBalance()== balance)
                System.out.println(client.toString());
        }
    }

    public static void sortByPrice(Metro metro) {
        metro.getClients().sort(new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return o1.compareTo(o2);
            }


        });

        metro.getClients().forEach(System.out::println);
    }

}

