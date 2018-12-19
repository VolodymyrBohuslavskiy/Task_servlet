package dao;
import model.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class OwnerDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connect");
    private EntityManager manager = factory.createEntityManager();

    public List findAllOwners() {
    return manager.createQuery("select ow from Owner ow").getResultList();
    }

    public void save(Owner owner) {
        manager.getTransaction().begin();
        manager.persist(owner);
        manager.getTransaction().commit();
    }


    public void close() {
        manager.close();
        factory.close();
    }


}