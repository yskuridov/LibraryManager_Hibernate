package ca.cal.tp.model.Loan;

import ca.cal.tp.model.Document.Abstract.Document;
import ca.cal.tp.model.User.Member;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "LOANS")
@Data
@NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private LocalDate dateBorrowed;
    private LocalDate dateDue;

    //OneToOne with Member -- borrower
    @ManyToOne
    @JoinColumn(name = "MEMBER_id")
    private Member borrower;
    //OneToMany with Document -- ArrayList<Documents>
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="DOCUMENTS_id")
    private Document document;

    public Loan(LocalDate dateBorrowed, LocalDate dateDue, Member borrower, Document document) {
        this.dateBorrowed = dateBorrowed;
        this.dateDue = dateDue;
        this.borrower = borrower;
        this.document = document;
    }
}
