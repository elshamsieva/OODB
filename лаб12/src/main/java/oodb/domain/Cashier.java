package oodb.domain;



import javax.persistence.*;


@Entity
public class Cashier {

    @Id
    @SequenceGenerator(name="Cashier", sequenceName="cashier_seq", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="Cashier")
    private int id;

    @Column
    private String name;

    @Column
    private String lastname;

    @Column
    private String shift;


    public String getName() {
        return name;
    }

    public String getShift() {
        return shift;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
}

