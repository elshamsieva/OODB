package ru.icmit.oodb.dz.lab3.dops;

public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int cardNumber;
    private double balance;


    public Person() {
    }

    public Person(String firstName, String lastName, String phoneNumber, int cardNumber, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cardNumber= cardNumber;
        this.balance= balance;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double balance) {
        this.cardNumber = cardNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance= balance;
    }

    public int compareTo(Object obj) {
        Person tmp = (Person) obj;
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