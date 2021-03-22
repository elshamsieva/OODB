package oodb.domain;


import javax.persistence.*;

@Entity
public class Goods {

    @Id
    @SequenceGenerator(name="Goods", sequenceName="goods_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="Goods")
    public int id;

    @Column
    private int cost;

    @Column
    private int quantity;

    @Column
    private String type;

    public Goods(int cost, int quantity, String goodstype)
    {
        this.type=goodstype;
        this.cost=cost;
        this.quantity=quantity;
    }

    public int getCost() {
        return cost;
    }

    public int getId(){return id; }

    public void setId(int id) {
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
