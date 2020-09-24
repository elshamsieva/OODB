package ru.icmit.oodb.dz.lab3;

import ru.icmit.oodb.dz.lab3.main.Client;
import ru.icmit.oodb.dz.lab3.main.Metro;
import ru.icmit.oodb.dz.lab3.main.TravelCard;

import java.util.ArrayList;
import java.util.List;
public class MainSave {

    public static void main(String[] args) {

        // Создаем объект банк
        Metro metro = new Metro();

        // Создаем объекты - клиенты банка
        Client client1 = new Client("Олег","Борисов","89996758900");
        Client client2 = new Client("Даниль","Батршин","89996758909");

        // Добавляем объекту client1 расчетный счет
        TravelCard travelCard = new TravelCard(75684);
        List<TravelCard> travelCards = new ArrayList<>();
        travelCards.add(travelCard);
        client1.setAccounts(travelCards);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        // Прикрепляем клиентов к банку
        metro.setClients(clients);

        // сохраняем объект в в XML документ
        XMLService.saveTravelCardData(metro);
    }
}
