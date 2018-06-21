package pl.sda.library.dao;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class FactorySession {

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration()
                .configure(FactorySession.class.getResource("/hibernate.cfg.xml"));

        StandardServiceRegistryBuilder registryBuilder =
                new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        SessionFactory sessionFactory = configuration.buildSessionFactory(registryBuilder.build());

        return sessionFactory;
    }
}
