package ca.cal.tp.persistence.Member;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.Document.Book;
import ca.cal.tp.model.User.Member;

import java.util.List;

public interface MemberDAO {
    <T> void save(T t);
    <T> void merge(T t);
    Document getDocument(int id);
    Member getMember(int id);
    Member getMemberWithLoans(int id);
    List<Book> getBooksByTitle(String title);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByYear(int year);
    List<Book> getBooksByGenre(String genre);
}
