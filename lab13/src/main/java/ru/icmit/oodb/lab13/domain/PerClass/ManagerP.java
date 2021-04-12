package ru.icmit.oodb.lab13.domain.PerClass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ManagerP extends PersonP {

    @Id
    Long id;

    String bankName;

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }
}