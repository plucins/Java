package dao;

import model.House;
import model.Mieszkaniec;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class MieszkaniecDAO implements AbstractDAO<Mieszkaniec, Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();

    public Mieszkaniec findByID(Long id) {
        Session session = sessionFactory.openSession();
        Mieszkaniec mieszkaniec = (Mieszkaniec) session.get(Mieszkaniec.class,id);
        return mieszkaniec;
    }

    public List<Mieszkaniec> findAll() {
        Session session = sessionFactory.openSession();
        List<Mieszkaniec> mieszkancy = (List<Mieszkaniec>) session.createQuery("from Mieszkaniec").list();
        return mieszkancy;
    }

    public void remove(Mieszkaniec entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Mieszkaniec entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void add(Mieszkaniec entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }
}
