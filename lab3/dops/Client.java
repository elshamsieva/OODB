package ru.icmit.oodb.dz.lab3.dops;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Client extends Person {

    public Client(String firstName, String lastName, String phoneNumber, int cardNumber, double balance) {
        super(firstName, lastName, phoneNumber, cardNumber, balance);
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
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", cardNumber='" + getCardNumber() + '\'' +
                ", balance='" + getBalance() + '\'' +
                '}';
    }
}