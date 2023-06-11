package ngan.lhb.vocablearn.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class PartOfSpeechDto {
    private Long partOfSpeechId;
    private String name;
    private String acronym;

    public PartOfSpeechDto(){}

    public PartOfSpeechDto(Long partOfSpeechId, String name, String acronym) {
        this.partOfSpeechId = partOfSpeechId;
        this.name = name;
        this.acronym = acronym;
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

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @Override
    public String toString() {
        return "PartOfSpeechDto{" +
                "partOfSpeechId=" + partOfSpeechId +
                ", name='" + name + '\'' +
                ", acronym='" + acronym + '\'' +
                '}';
    }
}
