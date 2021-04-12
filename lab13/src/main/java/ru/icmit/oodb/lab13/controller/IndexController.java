package ru.icmit.oodb.lab13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.icmit.oodb.lab13.domain.MappedSuperClass.Client;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class IndexController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping(value = "/")
    @ResponseBody
    @Transactional
    public List getBanks() {


        Client client = new Client();
        client.setPin(123);
        client.setCardNumber(Long.parseLong("21234567890"));
        client.setName("Elina");


        return entityManager.createQuery("select c from Client c").getResultList();
    }
}