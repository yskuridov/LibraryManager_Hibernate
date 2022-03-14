package ca.cal.tp.persistence.Member;

import ca.cal.tp.model.Document.Book;
import ca.cal.tp.persistence.CommonDAOJPAH2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class MemberDAOJPAH2 extends CommonDAOJPAH2 implements MemberDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp");

    public List<Book> getBooksByTitle(String title){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Book> query = em.createQuery(
                "select book from Book book where book.title like :title"
                , Book.class);
        query.setParameter("title", "%" + title + "%"); //% stands for any character - allows to check if title contains string

        List<Book> books = query.getResultList();
        em.getTransaction().commit();
        em.close();

        return books;
    }

    public List<Book> getBooksByAuthor(String author){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Book> query = em.createQuery(
                "select book from Book book where book.author like :author"
                , Book.class);
        query.setParameter("author", author);

        List<Book> books = query.getResultList();
        em.getTransaction().commit();
        em.close();

        return books;
    }

    public List<Book> getBooksByYear(int year){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Book> query = em.createQuery(
                "select book from Book book where book.publicationYear = :year"
                , Book.class);
        query.setParameter("year", year);

        List<Book> books = query.getResultList();
        em.getTransaction().commit();
        em.close();

        return books;
    }

    public List<Book> getBooksByGenre(String genre){
        final EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        final TypedQuery<Book> query = em.createQuery(
                "select book from Book book where book.genre like :genre"
                , Book.class);
        query.setParameter("genre", genre);

        List<Book> books = query.getResultList();
        em.getTransaction().commit();
        em.close();

        return books;
    }

}
