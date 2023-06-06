package ngan.lhb.vocablearn.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "VOCABULARY")
@Table
public class Vocabulary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VOCABULARY_ID")
    private Long vocabularyId;

    @Column(name = "VOCABULARY")
    private String vocabulary;

    @Column(name = "ENGLISH_MEAN")
    private String englishMean;

    @Column(name = "VIETNAMESE_MEAN")
    private String vietnameseMean;

    @ManyToOne
    @JoinColumn(name="PART_OF_SPEECH_ID", nullable=false)
    private PartOfSpeech partOfSpeech;

    @ManyToOne
    @JoinColumn(name = "COURSE_ID", nullable = false)
    private Course course;

    @Column(name = "THUMBNAIL_IMAGE")
    private String thumbnailImage;

    @Column(name = "VOCAB_AUDIO")
    private String vocabAudio;

    @Column(name = "DELETE_FLAG")
    private boolean deleteFlag;

    @OneToMany(mappedBy = "vocabulary")
    public Set<VocabularySentance> vocabularySentances = new HashSet<VocabularySentance>();

    @OneToMany(mappedBy = "vocabulary")
    public Set<VocabularyNotebook> vocabularyNotebooks = new HashSet<VocabularyNotebook>();

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATE")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Set<VocabularySentance> getVocabularySentances() {
        return vocabularySentances;
    }

    public void setVocabularySentances(Set<VocabularySentance> vocabularySentances) {
        this.vocabularySentances = vocabularySentances;
    }

    public Vocabulary() {

    }

    public Set<VocabularyNotebook> getVocabularyNotebooks() {
        return vocabularyNotebooks;
    }

    public void setVocabularyNotebooks(Set<VocabularyNotebook> vocabularyNotebooks) {
        this.vocabularyNotebooks = vocabularyNotebooks;
    }

    public String getVocabAudio() {
        return vocabAudio;
    }

    public void setVocabAudio(String vocabAudio) {
        this.vocabAudio = vocabAudio;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(Long vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getEnglishMean() {
        return englishMean;
    }

    public void setEnglishMean(String englishMean) {
        this.englishMean = englishMean;
    }

    public String getVietnameseMean() {
        return vietnameseMean;
    }

    public void setVietnameseMean(String vietnameseMean) {
        this.vietnameseMean = vietnameseMean;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    @JsonBackReference
    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public Course getCourse() {
        return course;
    }
    @JsonBackReference
    public void setCourse(Course course) {
        this.course = course;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public Vocabulary(Long vocabularyId, String vocabulary, String englishMean, String vietnameseMean, String thumbnailImage, String vocabAudio, boolean deleteFlag) {
        this.vocabularyId = vocabularyId;
        this.vocabulary = vocabulary;
        this.englishMean = englishMean;
        this.vietnameseMean = vietnameseMean;
        this.thumbnailImage = thumbnailImage;
        this.vocabAudio = vocabAudio;
        this.deleteFlag = deleteFlag;
    }
}
