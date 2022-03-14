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

    public Book(int id, String title, int publicationYear, String language, String author, String editor, int pageAmount, String genre) {
        super(id, title, publicationYear, language);
        this.author = author;
        this.editor = editor;
        this.pageAmount = pageAmount;
        this.genre = genre;
        this.setLoanLength(BOOK_LOAN_LENGTH);
    }
}
