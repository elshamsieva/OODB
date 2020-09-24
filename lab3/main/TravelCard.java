package ru.icmit.oodb.dz.lab3.main;

import javax.xml.bind.annotation.XmlElement;

public class TravelCard {
    private long cardNumber;

    private double balance;

    private int proezd = 22;

    public TravelCard(long cardNumber) {
        this.cardNumber = cardNumber;
        this.balance = 0;
    }

    public TravelCard() {
    }

    @XmlElement(name = "cardNumber")
    long getCardNumber() {
        return cardNumber;
    }

    @XmlElement(name = "balance")
    double getBalance() {
        return balance;
    }

    public void setAccountNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    protected void increaseBalance(double cash) {
        this.balance += cash/proezd;
    }

    protected boolean reduceBalance(double cash) {
        if (balance < cash/proezd) {
            return false;
        } else {
            this.balance -= cash/proezd;
            return true;
        }
    }

    @Override
    public String toString() {
        return "TravelCard info:" +
                "cardNumber=" + cardNumber +
                ", balance=" + balance +
                '\n';
    }
}
