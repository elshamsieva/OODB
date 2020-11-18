package ru.icmit.oodb.dz.lab3;

import ru.icmit.oodb.dz.lab3.dops.Client;
import ru.icmit.oodb.dz.lab3.dops.Metro;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws JAXBException {

        Metro metro = new Metro();

        Client client1 = new Client("Булат", "ГУзаиров", "56765433", 1, 44.0);
        Client client2 = new Client("Олег", "Борисов", "345465356",2, 110.0);
        Client client3 = new Client("Данил", "Гарбажий", "99876547", 3, 66.0);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        metro.setClients(clients);

        XMLService.saveTravelCardData(metro);

        Metro metro1 = XMLService.loadMetroFromXML();
        assert metro1 != null;
        metro1.showCards();

        System.out.println("\n********** Sorting product by price **********\n");
        XMLService.sortByPrice(metro1);

        System.out.println("\n********** Searching product by price **********\n");
        XMLService.searchByPrice(metro1, 44.0);






    }


}