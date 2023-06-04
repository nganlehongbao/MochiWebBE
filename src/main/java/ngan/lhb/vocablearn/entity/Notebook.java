package ngan.lhb.vocablearn.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "NOTEBOOK")
@Table
public class Notebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTEBOOK_ID")
    private Long notebookId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "AUDIO")
    private String audio;

    @OneToMany(mappedBy = "notebook")
    public Set<VocabularyNotebook> vocabularyNotebooks = new HashSet<VocabularyNotebook>();

}
