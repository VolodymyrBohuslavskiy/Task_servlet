package dao;

import model.Car;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class addDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connect");
    private EntityManager manager = factory.createEntityManager();









    public void save(Car car) {
        manager.getTransaction().begin();
        manager.persist(car);
        manager.getTransaction().commit();
    }


    public void close() {
        manager.close();
        factory.close();
    }
}
