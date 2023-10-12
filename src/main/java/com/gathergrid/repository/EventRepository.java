package com.gathergrid.repository;

import com.gathergrid.domain.Event;

import javax.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EventRepository {
    private final EntityManagerFactory entityManagerFactory;
    public EventRepository(){
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
    }

//    public void save(Event event) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(event);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//    }
}
