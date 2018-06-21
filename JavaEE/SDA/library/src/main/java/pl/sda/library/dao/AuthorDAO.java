package pl.sda.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sda.library.model.Author;

import java.util.List;

public class AuthorDAO implements AbstractDAO<Author,Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();


    public Author findByID(Long id) {
        Session session = sessionFactory.openSession();
        Author author = (Author) session.get(Author.class,id);
        return author;
    }

    public List<Author> findAll() {
        Session session = sessionFactory.openSession();
        List<Author> authors = (List<Author>) session.createQuery("from Author").list();
        return authors;
    }

    public void remove(Author entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Author entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void add(Author entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

}
