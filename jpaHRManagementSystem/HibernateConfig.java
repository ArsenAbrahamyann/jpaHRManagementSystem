package jpaHRManagementSystem;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfig {

    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;

    /**
     * Provides a singleton instance of Hibernate SessionFactory for database interaction.
     * The SessionFactory is configured based on the Hibernate configuration file.
     * If the SessionFactory is not yet created, it initializes it using the Hibernate configuration.
     *
     * @return The singleton instance of the Hibernate SessionFactory.
     */
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
        try {
            registry = new StandardServiceRegistryBuilder().configure().build();
            Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
            sessionFactory = metadata.getSessionFactoryBuilder().build();
        } catch (Exception e) {
            e.printStackTrace();
            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }
    }
        return sessionFactory;
    }
}
