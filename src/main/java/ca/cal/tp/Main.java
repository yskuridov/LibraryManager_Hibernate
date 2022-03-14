package ca.cal.tp;

import ca.cal.tp.persistence.Employee.EmployeeDAOJPAH2;
import ca.cal.tp.persistence.Member.MemberDAOJPAH2;
import ca.cal.tp.service.EmployeeService;
import ca.cal.tp.service.MemberService;

public class Main {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService(new EmployeeDAOJPAH2());
        MemberService ms = new MemberService(new MemberDAOJPAH2());
        var member1Id = es.addNewMember("Dwayne", "Johnson", "NY");
        var member2Id = es.addNewMember("Kevin", "Hart", "NY");
        var book1Id = es.addBook("Skete", 2022, "English", "Ye", "Ye", 228, "Comedy");
        var book2Id = es.addBook("Skete", 2022, "English", "Ye", "Ye", 228, "Comedy");
        es.createLoan(member1Id, book1Id);
        es.createLoan(member2Id, book2Id);
        System.out.println(ms.getLoans(member2Id));
        System.out.println(ms.getLoans(member1Id));
        ms.getDatesOfReturn(member2Id);
    }
}
