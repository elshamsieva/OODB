package ru.icmit.oodb.lab13.domain.MappedSuperClass;

import javax.persistence.*;

@MappedSuperclass
public class Person extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person")
    @SequenceGenerator(name = "person", sequenceName = "person_seq", allocationSize=1)
    private Long id;

    String name;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id=id;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }
}
