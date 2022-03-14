package ca.cal.tp.model.Document.Abstract;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENTS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "document_type")
@Data
@NoArgsConstructor
public abstract class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private int publicationYear;
    private String language;
    private int loanLength;


    public Document(String title, int publicationYear, String language) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.language = language;
    }
}
