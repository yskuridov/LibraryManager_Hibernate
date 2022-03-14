package ca.cal.tp.persistence;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.User.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public abstract class CommonDAOJPAH2 {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp");

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

    public Member getMember(int id){
        final EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        final Member member = em.find(Member.class, id);
        em.getTransaction().commit();
        em.close();

        return member;
    }

    public Member getMemberWithLoans(int id){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Member> query = em.createQuery(
                "select m from Member m left join fetch m.loanList pc where m.id = :id"
                , Member.class);
        query.setParameter("id", id);
        final Member member = query.getSingleResult();

        em.getTransaction().commit();
        em.close();
        return member;
    }
}
