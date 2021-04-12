package ru.icmit.oodb.lab13.domain.PerClass;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientP extends PersonP {

    @Id
    Long id;

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

