package ru.icmit.oodb.lab13.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.icmit.oodb.lab13.domain.MappedSuperClass.Manager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class ManagerController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping(value = "/Manager/")
    @ResponseBody
    @Transactional
    public List getBanks() {

        Manager manager = new Manager();
        manager.setName("Ivan");
        manager.setBankName("SberBank");
        entityManager.persist(manager);


        return entityManager.createQuery("select c from Manager c").getResultList();
    }
}