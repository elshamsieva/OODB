package ru.icmit.oodb.lab13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.icmit.oodb.lab13.domain.PerClass.ClientP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class ClientPerClassController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping(value = "/PerClass/Client/")
    @ResponseBody
    @Transactional
    public List getBanks() {


        ClientP client = new ClientP();
        client.setPin(123);
        client.setCardNumber(Long.parseLong("1234567890"));
        client.setName("Elina");
        entityManager.persist(client);

        return entityManager.createQuery("select c from ClientP c").getResultList();
    }
}