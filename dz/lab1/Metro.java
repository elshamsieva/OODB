package ru.icmit.oodb.dz.lab1;



import java.util.List;

public class Metro {

    private String name;

    private List<Client> clients;

    private List<Info> infos;

    private List<TravelCard> travelCards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    public List<TravelCard> getTravelCards() {
        return travelCards;
    }

    public void setTravelCards(List<TravelCard> travelCards) {
        this.travelCards = travelCards;
    }

    @Override
    public String toString() {
        return "Bank: " +
                "name='" + name + '\n' +
                ", clients=" + clients + '\n' +
                ", infos=" + infos + '\n' +
                ", travelCards=" + travelCards;
    }
}