package ngan.lhb.vocablearn.entity;

import jakarta.persistence.*;

@Entity(name = "VOCABULARY_SENTANCE")
@Table
public class VocabularySentance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOCABULARY_SENTANCE_ID")
    private Long vocabularySentanceId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SENTANCE_ID")
    private Sentance sentance;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VOCABULARY_ID")
    private Vocabulary vocabulary;

    @Column(name = "ORDER_OF_LETTERS")
    private int orderOfLetters;

    public Long getVocabularySentanceId() {
        return vocabularySentanceId;
    }

    public void setVocabularySentanceId(Long vocabularySentanceId) {
        this.vocabularySentanceId = vocabularySentanceId;
    }

    public Sentance getSentance() {
        return sentance;
    }

    public void setSentance(Sentance sentance) {
        this.sentance = sentance;
    }

    public Vocabulary getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(Vocabulary vocabulary) {
        this.vocabulary = vocabulary;
    }

    public int getOrderOfLetters() {
        return orderOfLetters;
    }

    public void setOrderOfLetters(int orderOfLetters) {
        this.orderOfLetters = orderOfLetters;
    }
}
