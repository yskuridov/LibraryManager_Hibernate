package ca.cal.tp.service;

import ca.cal.tp.model.Document.Book;
import ca.cal.tp.model.Loan.Loan;
import ca.cal.tp.persistence.Member.MemberDAO;

import java.util.List;

public class MemberService {
    MemberDAO dao;

    public MemberService(MemberDAO dao){
        this.dao = dao;
    }

    public List<Loan> getLoans(int id){
        return dao.getMember(id).getLoanList();
    }

    public List<Book> getBooksByTitle(String title){
        return dao.getBooksByTitle(title);
    }

    public List<Book> getBooksByAuthor(String author){
        return dao.getBooksByAuthor(author);
    }

    public List<Book> getBooksByYear(int year){
        return dao.getBooksByYear(year);
    }

    public List<Book> getBooksByGenre(String genre){
        return dao.getBooksByGenre(genre);
    }
}
