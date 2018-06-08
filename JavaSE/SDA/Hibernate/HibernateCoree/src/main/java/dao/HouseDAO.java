package dao;

import model.House;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class HouseDAO implements AbstractDAO<House,Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();


    public House findByID(Long id) {
        Session session = sessionFactory.openSession();
        House house = (House) session.get(House.class,id);
        return house;
    }

    public List<House> findAll() {
        Session session = sessionFactory.openSession();
        List<House> houses = (List<House>) session.createQuery("from House").list();
        return houses;
    }

    public void remove(House entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(House entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void add(House entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }
}
