package ru.icmit.oodb.dz.lab1;

import java.util.Date;

public class Info {

    private TravelCard travelCard;

    private Date infoDate;

    private Client client;

    private double amount;

    public Info(TravelCard travelCard, Client client, double amount) {
        this.travelCard = travelCard;
        this.infoDate = new Date();
        this.client = client;
        this.amount = amount;
        if (amount > 0) {
            increaseBalance(amount);
        } else {
            reduceBalance(amount);
        }
    }

    public Info() {
    }

    private void increaseBalance(double amount) {
        travelCard.increaseBalance(amount);
    }

    private boolean reduceBalance(double amount) {
        return travelCard.reduceBalance(amount);
    }

    public TravelCard getTravelCard() {
        return travelCard;
    }

    public void setTravelCard(TravelCard travelCard) {
        this.travelCard = travelCard;
    }

    public Date getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(Date infoDate) {
        this.infoDate = infoDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
