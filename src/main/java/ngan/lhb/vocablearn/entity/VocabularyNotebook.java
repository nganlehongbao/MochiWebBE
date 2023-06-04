package ngan.lhb.vocablearn.entity;

import jakarta.persistence.*;

@Entity(name = "VOCABULARY_NOTEBOOK")
@Table
public class VocabularyNotebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOCABULARY_NOTEBOOK_ID")
    private Long VocabularyNotebookId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "NOTEBOOK_ID")
    private Notebook notebook;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VOCABULARY_ID")
    private Vocabulary vocabulary;
}
