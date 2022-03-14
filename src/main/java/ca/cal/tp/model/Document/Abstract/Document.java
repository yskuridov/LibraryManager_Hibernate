package ca.cal.tp.model.Document.Abstract;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DOCUMENTS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DOCUMENT_TYPE")
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


    public Document(int id, String title, int publicationYear, String language) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
        this.language = language;
    }
}
