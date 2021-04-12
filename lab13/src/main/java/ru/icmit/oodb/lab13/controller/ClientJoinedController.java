package ru.icmit.oodb.lab13.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.icmit.oodb.lab13.domain.Joined.ClientJ;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class ClientJoinedController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping(value = "/Joined/Client/")
    @ResponseBody
    @Transactional
    public List getBanks() {


        ClientJ client = new ClientJ();
        client.setPin(123);
        client.setCardNumber(Long.parseLong("1234567890"));
        client.setName("Elina");
        entityManager.persist(client);


        return entityManager.createQuery("select c from ClientJ c").getResultList();
    }
}