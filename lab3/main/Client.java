package ru.icmit.oodb.dz.lab3.main;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Client extends Person {

    public Client(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }


    public Client() {


    }
    @XmlElementWrapper(name = "travelCards")
    @XmlElement(name = "travelCard")
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