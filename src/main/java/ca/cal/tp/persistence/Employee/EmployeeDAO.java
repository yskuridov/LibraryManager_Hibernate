package ca.cal.tp.persistence.Employee;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.User.Member;

import java.time.LocalDate;

public interface EmployeeDAO {
    <T> void save(T t);
    <T> void merge(T t);
    Document getDocument(int id);
    int createNewMember(String firstName, String lastName, String address);
    int createNewLoan(LocalDate dateBorrowed, LocalDate dateDue, Member borrower, Document document);
    int addBook(String title, int pYear, String language, String author, String editor, int pAmount, String genre);
    int addCd(String title, int pYear, String singer, int numOfTracks, String genre);
    int addDvd(String title, int pYear, String language, int duration, String category, String mainActor);
}
