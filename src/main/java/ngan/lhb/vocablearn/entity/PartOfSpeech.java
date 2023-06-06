package ngan.lhb.vocablearn.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "PART_OF_SPEECH")
@Table
public class PartOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PART_OF_SPEECH_ID")
    private Long partOfSpeechId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ACRONYM")
    private String acronym;

    @OneToMany(mappedBy = "partOfSpeech", fetch = FetchType.EAGER)
    List<Vocabulary> vocabularyList = new ArrayList<>();

    public PartOfSpeech(){}

    public PartOfSpeech(Long partOfSpeechId, String name, String acronym) {
        this.partOfSpeechId = partOfSpeechId;
        this.name = name;
        this.acronym = acronym;
    }

    public PartOfSpeech(Long partOfSpeechId, String name, String acronym, List<Vocabulary> vocabularyList) {
        this.partOfSpeechId = partOfSpeechId;
        this.name = name;
        this.acronym = acronym;
        this.vocabularyList = vocabularyList;
    }

    public Long getPartOfSpeechId() {
        return partOfSpeechId;
    }

    public void setPartOfSpeechId(Long partOfSpeechId) {
        this.partOfSpeechId = partOfSpeechId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonManagedReference
    public List<Vocabulary> getVocabularyList() {
        return vocabularyList;
    }

    public void setVocabularyList(List<Vocabulary> vocabularyList) {
        this.vocabularyList = vocabularyList;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}
