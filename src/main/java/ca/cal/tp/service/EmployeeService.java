package ca.cal.tp.service;

import ca.cal.tp.model.Loan.Loan;
import ca.cal.tp.persistence.Employee.EmployeeDAO;

import java.time.LocalDate;

public class EmployeeService {
    EmployeeDAO dao;

    public EmployeeService(EmployeeDAO dao){
        this.dao = dao;
    }

    public int createLoan(int memberId, int documentId){
        var member = dao.getMemberWithLoans(memberId);
        var document = dao.getDocument(documentId);
        Loan loan = new Loan(LocalDate.now(), LocalDate.now().plusDays(document.getLoanLength()), member, document);
        member.getLoanList().add(loan);
        dao.merge(loan);
        dao.merge(member);
        return loan.getId();
    }

    public int addNewMember(String firstName, String lastName, String address){
        return dao.addNewMember(firstName, lastName, address);
    }

    public int addBook(String title, int pYear, String language, String author, String editor, int pAmount, String genre){
        return dao.addBook(title, pYear, language, author, editor, pAmount, genre);
    }

    public int addCd(String title, int pYear, String language, String singer, int numOfTracks, String genre){
        return dao.addCd(title, pYear, language, singer, numOfTracks, genre);
    }

    public int addDvd(String title, int pYear, String language, int duration, String category, String mainActor){
        return dao.addDvd(title, pYear, language, duration, category, mainActor);
    }
}
