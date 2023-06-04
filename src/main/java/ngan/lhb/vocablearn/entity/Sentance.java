package ngan.lhb.vocablearn.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "SENTANCE")
@Table
public class Sentance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sentanceId;

    @Column(name = "AUDIO")
    private String audio;

    @OneToMany(mappedBy = "sentance")
    public Set<VocabularySentance> vocabularySentances = new HashSet<VocabularySentance>();

    public Set<VocabularySentance> getVocabularySentances() {
        return vocabularySentances;
    }

    public void setVocabularySentances(Set<VocabularySentance> vocabularySentances) {
        this.vocabularySentances = vocabularySentances;
    }

    public Long getSentanceId() {
        return sentanceId;
    }

    public void setSentanceId(Long sentanceId) {
        this.sentanceId = sentanceId;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
