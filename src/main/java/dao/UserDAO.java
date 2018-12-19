package dao;

import model.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;



public class UserDAO {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("zzz");
    EntityManager manager = factory.createEntityManager();


    public List<user> findAll() {
        return manager.createQuery("select u from user u", user.class).getResultList();
    }

    public void save(user user) {
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();

    }

    public void close() {
        manager.close();
        factory.close();
    }



}