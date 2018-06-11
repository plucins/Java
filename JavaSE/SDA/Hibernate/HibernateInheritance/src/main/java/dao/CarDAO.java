package dao;

import model.Car;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CarDAO implements AbstractDAO<Car,Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();

    @PersistenceContext
    EntityManager em;


    @Override
    public Car findByID(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Car car = (Car) session.get(Car.class,id);
        session.getTransaction().commit();
        session.close();
        return car;
    }

    @Override
    public List<Car> findAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Car> cars = (List<Car>) session.createQuery("from Car").list();
        session.getTransaction().commit();
        session.close();
        return cars;
    }

    @Override
    public void remove(Car entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Car entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void add(Car entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

    public List<Car> getCarsByBrand(String brand){
        Session session = sessionFactory.openSession();
        Query query = session.getNamedQuery("carByBrand")
                .setString("brand",brand);
        return (List<Car>)query.list();
    }
}