package dao;
import model.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CarDAO {
    private EntityManagerFactory factory = Persistence.createEntityManagerFactory("connect");
    private EntityManager manager = factory.createEntityManager();

    public List<Car> findAllCars() {
        return manager.createQuery("select c from Car c", Car.class).getResultList();
    }

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
