package ru.icmit.oodb.dz.lab2.dops;





import java.util.List;

public class Client extends Person {

    public Client(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }


    public Client() {


    }

    private List<TravelCard> travelCards;


    public List<TravelCard> getAccounts() {
        return travelCards;
    }

    public void setAccounts(List<TravelCard> travelCards) {
        this.travelCards = travelCards;
    }

    @Override
    public String toString() {
        return "Client: " + getLastName() +
                ", travel card=" + travelCards +
                '\n';
    }
}