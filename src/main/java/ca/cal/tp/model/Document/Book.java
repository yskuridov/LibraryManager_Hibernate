package ca.cal.tp.model.Document;

import ca.cal.tp.model.Document.Abstract.Document;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Book extends Document {
    private String author;
    private String editor;
    private int pageAmount;
    private String genre;
    private static final int BOOK_LOAN_LENGTH = 21; //days
}
