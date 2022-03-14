package ca.cal.tp.model.Document;

import ca.cal.tp.model.Document.Abstract.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CD")
@Data
@NoArgsConstructor
public class Cd extends Document {
    private String singer;
    private int numberOfTracks;
    private String genre;
    private static final int CD_LOAN_LENGTH = 14; //days

    public Cd(String title, int publicationYear, String language, String singer, int numberOfTracks, String genre) {
        super(title, publicationYear, language);
        this.singer = singer;
        this.numberOfTracks = numberOfTracks;
        this.genre = genre;
        this.setLoanLength(CD_LOAN_LENGTH);
    }
}
