package ru.icmit.oodb.lab13.domain.Joined;

import javax.persistence.Entity;

@Entity
public class ManagerJ extends PersonJ{

    String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
