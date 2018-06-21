package pl.sda.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sda.library.model.Book;

import java.util.List;

public class BookDAO implements AbstractDAO<Book,Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();


    public Book findByID(Long id) {
        Session session = sessionFactory.openSession();
        Book book = (Book) session.get(Book.class,id);
        return book;
    }

    public List<Book> findAll() {
        Session session = sessionFactory.openSession();
        List<Book> books = (List<Book>) session.createQuery("from Book").list();
        return books;
    }

    public void remove(Book entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Book entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void add(Book entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

}
