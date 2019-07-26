package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseManager {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("PMD");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

}
