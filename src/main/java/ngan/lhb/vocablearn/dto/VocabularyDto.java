package ngan.lhb.vocablearn.dto;

import java.util.Date;

public class VocabularyDto {
    private Long vocabularyId;
    private String vocabulary;
    private String englishMean;
    private String vietnameseMean;
    private Long partOfSpeechId;
    private Long courseId;
    private String thumbnailImage;
    private String vocabAudio;
    private boolean deleteFlag;
    private Date createDate;
    private Date updateDate;

    public VocabularyDto(){}

    public VocabularyDto(
            Long vocabularyId
            , String vocabulary
            , String englishMean
            , String vietnameseMean
            , Long partOfSpeechId
            , Long courseId
            , String thumbnailImage
            , String vocabAudio
            , boolean deleteFlag
            , Date createDate
            , Date updateDate) {
        this.vocabularyId = vocabularyId;
        this.vocabulary = vocabulary;
        this.englishMean = englishMean;
        this.vietnameseMean = vietnameseMean;
        this.partOfSpeechId = partOfSpeechId;
        this.courseId = courseId;
        this.thumbnailImage = thumbnailImage;
        this.vocabAudio = vocabAudio;
        this.deleteFlag = deleteFlag;
        this.createDate = createDate;
        this.updateDate = updateDate;
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

    public Long getPartOfSpeechId() {
        return partOfSpeechId;
    }

    public void setPartOfSpeechId(Long partOfSpeechId) {
        this.partOfSpeechId = partOfSpeechId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
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

    @Override
    public String toString() {
        return "VocabularyDto{" +
                "vocabularyId=" + vocabularyId +
                ", vocabulary='" + vocabulary + '\'' +
                ", englishMean='" + englishMean + '\'' +
                ", vietnameseMean='" + vietnameseMean + '\'' +
                ", partOfSpeechId='" + partOfSpeechId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                ", vocabAudio='" + vocabAudio + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
