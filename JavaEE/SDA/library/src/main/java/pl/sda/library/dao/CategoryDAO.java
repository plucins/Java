package pl.sda.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pl.sda.library.model.Category;

import java.util.List;

public class CategoryDAO implements AbstractDAO<Category, Long> {

    private SessionFactory sessionFactory = FactorySession.getSessionFactory();


    public Category findByID(Long id) {
        Session session = sessionFactory.openSession();
        Category category = (Category) session.get(Category.class, id);
        return category;
    }

    public List<Category> findAll() {
        Session session = sessionFactory.openSession();
        List<Category> category = (List<Category>) session.createQuery("from Category").list();
        return category;
    }

    public void remove(Category entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Category entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
    }

    public void add(Category entity) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
    }

}
