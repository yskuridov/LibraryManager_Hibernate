package ca.cal.tp.model.User;

import ca.cal.tp.model.User.Abstract.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEES")
@DiscriminatorValue("EMPLOYEE")
@Data
@NoArgsConstructor
public class Employee extends User {
    public Employee(String firstName, String lastName, String address) {
        super(firstName, lastName, address);
    }
}
