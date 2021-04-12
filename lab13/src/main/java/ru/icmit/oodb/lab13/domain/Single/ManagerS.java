package ru.icmit.oodb.lab13.domain.Single;

import javax.persistence.Entity;

@Entity
public class ManagerS extends PersonS{

    String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
