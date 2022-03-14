package ca.cal.tp.persistence.Employee;

import ca.cal.tp.model.Document.Book;
import ca.cal.tp.model.Document.Cd;
import ca.cal.tp.model.Document.Dvd;
import ca.cal.tp.model.Loan.Loan;
import ca.cal.tp.model.User.Member;
import ca.cal.tp.persistence.CommonDAOJPAH2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDAOJPAH2 extends CommonDAOJPAH2 implements EmployeeDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("tp");

    public int addNewMember(String firstName, String lastName, String address){
        final Member member = new Member(firstName, lastName, address);
        save(member);

        return member.getId();
    }

    public int addBook(String title, int pYear, String language, String author, String editor, int pAmount, String genre) {
        final Book book = new Book(title, pYear, language, author, editor, pAmount, genre);
        save(book);

        return book.getId();
    }

    public int addCd(String title, int pYear, String language, String singer, int numOfTracks, String genre) {
        final Cd cd = new Cd(title, pYear, language, singer, numOfTracks, genre);
        save(cd);

        return cd.getId();
    }

    public int addDvd(String title, int pYear, String language, int duration, String category, String mainActor) {
        final Dvd dvd = new Dvd(title, pYear, language, duration, category, mainActor);
        save(dvd);

        return dvd.getId();
    }

}
