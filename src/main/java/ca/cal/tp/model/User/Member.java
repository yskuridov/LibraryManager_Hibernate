package ca.cal.tp.model.User;

import ca.cal.tp.model.Loan.Loan;
import ca.cal.tp.model.User.Abstract.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MEMBERS")
@DiscriminatorValue("MEMBER")
@Data
@NoArgsConstructor
public class Member extends User {
    double debt = 0.00;

    @OneToMany(mappedBy = "borrower")
    @ToString.Exclude
    List<Loan> loanList = new ArrayList<>();

    public Member(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }

}
