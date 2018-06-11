package dao;

import model.Car;
import model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonDAO implements AbstractDAO<Person,Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();

    @Override
    public Person findByID(Long id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Person person = (Person) session.get(Car.class,id);
        session.getTransaction().commit();
        session.close();
        return person;
    }

    @Override
    public List<Person> findAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Person> personList = (List<Person>) session.createQuery("from Car").list();
        session.getTransaction().commit();
        session.close();
        return personList;
    }

    @Override
    public void remove(Person entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Person entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void add(Person entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }
}
