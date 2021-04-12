package ru.icmit.oodb.lab13.domain.MappedSuperClass;

import javax.persistence.Entity;

@Entity
public class Manager extends Person{

    String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}
