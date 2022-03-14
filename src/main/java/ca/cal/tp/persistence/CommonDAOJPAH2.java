package ca.cal.tp.persistence;

import ca.cal.tp.model.Document.Abstract.Document;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class CommonDAOJPAH2 {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp");

    public <T> void save(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(t);

        em.getTransaction().commit();
        em.close();

    }

    public <T> void merge(T t) {
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.merge(t);

        em.getTransaction().commit();
        em.close();

    }

    public Document getDocument(int id){
        final EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        final Document document = em.find(Document.class, id);
        em.getTransaction().commit();
        em.close();

        return document;
    }
}
