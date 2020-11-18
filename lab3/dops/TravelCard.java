package ru.icmit.oodb.dz.lab3.dops;

import javax.xml.bind.annotation.XmlElement;

public class TravelCard implements Comparable{
    public long getCardNumber;
    private int cardNumber;

    private double balance;

    private int proezd = 22;

    public TravelCard(int cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }



    @XmlElement(name = "cardNumber")
    public long getCardNumber() {
        return cardNumber;
    }

    @XmlElement(name = "balance")
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int cardNumber) {
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


    public int compareTo(Object obj) {
        TravelCard tmp = (TravelCard) obj;
        if(this.getBalance() < tmp.getBalance())
        {
            /* текущее меньше полученного */
            return -1;
        }
        else if(this.getBalance() > tmp.getBalance())
        {
            /* текущее больше полученного */
            return 1;
        }
        /* текущее равно полученному */
        return 0;
    }
}
