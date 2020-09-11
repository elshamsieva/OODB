package com.company.lab1;



import java.util.List;

public class Client extends Person {

    public Client(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
    }

    public Client() {
    }

    private List<TravelCard> cards;

    public List<TravelCard> getAccounts() {
        return cards;
    }

    public void setAccounts(List<TravelCard> accounts) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Client: " + getLastName() +
                ", Travel card =" + cards +
                '\n';
    }
}