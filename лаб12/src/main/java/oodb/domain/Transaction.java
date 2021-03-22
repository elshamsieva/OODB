package oodb.domain;

import javax.persistence.*;
import java.util.Collection;


@Entity
public class Transaction {


    @Id
    @SequenceGenerator(name="Transaction", sequenceName="transaction_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="Transaction")
    public int id;

    @ManyToOne
    private Cashier cashier;

    @OneToMany
    private Collection<Goods> goodsList;

    public Transaction(Shop shop, Cashier cashier, Collection<Goods> goodsList)
    {
        this.cashier=cashier;
        this.goodsList=goodsList;
    }


    public Cashier getCashier() {
        return cashier;
    }

    public Collection<Goods> getGoodsList() {
        return goodsList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCashier(Cashier cashier) {
        this.cashier = cashier;
    }

    public void setGoodsList(Collection<Goods> goodsList) {
        this.goodsList = goodsList;
    }

}
