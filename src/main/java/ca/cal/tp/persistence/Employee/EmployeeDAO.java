package ca.cal.tp.persistence.Employee;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.Loan.Loan;
import ca.cal.tp.model.User.Member;

public interface EmployeeDAO {
    <T> void save(T t);
    <T> void merge(T t);
    Document getDocument(int id);
    Member getMember(int id);
    Loan getLoan(int id);
    int addNewMember(String firstName, String lastName, String address);
    int addBook(String title, int pYear, String language, String author, String editor, int pAmount, String genre);
    int addCd(String title, int pYear, String language, String singer, int numOfTracks, String genre);
    int addDvd(String title, int pYear, String language, int duration, String category, String mainActor);
}
