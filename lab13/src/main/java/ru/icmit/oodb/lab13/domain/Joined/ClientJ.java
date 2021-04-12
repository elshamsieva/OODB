package ru.icmit.oodb.lab13.domain.Joined;

import javax.persistence.Entity;

@Entity
public class ClientJ extends PersonJ{
    Long cardNumber;

    int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin()
    {
        return this.pin;
    }

    public void setCardNumber(Long cardNumber)
    {
        this.cardNumber=cardNumber;
    }

    public Long getCardNumber()
    {
        return this.cardNumber;
    }
}
