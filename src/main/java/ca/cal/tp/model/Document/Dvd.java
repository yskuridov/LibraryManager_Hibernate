package ca.cal.tp.model.Document;

import ca.cal.tp.model.Document.Abstract.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("DVD")
@Data
@NoArgsConstructor
public class Dvd extends Document {
    private int durationInMinutes;
    private String category;
    private String mainActor;
    private static final int DVD_LOAN_LENGTH = 7; //days

    public Dvd(int id, String title, int publicationYear, String language, int durationInMinutes, String category, String mainActor) {
        super(id, title, publicationYear, language);
        this.durationInMinutes = durationInMinutes;
        this.category = category;
        this.mainActor = mainActor;
        this.setLoanLength(DVD_LOAN_LENGTH);
    }
}
