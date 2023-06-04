package ngan.lhb.vocablearn.dto;

public class VocabularyDto {
    private Long vocabularyId;
    private String vocabulary;
    private String englishMean;
    private String vietnameseMean;
    private Long partOfSpeechId;
    private Long courseId;
    private String thumbnailImage;

    public VocabularyDto(Long vocabularyId, String vocabulary, String englishMean,
                         String vietnameseMean, Long partOfSpeechId, Long courseId,
                         String thumbnailImage) {
        this.vocabularyId = vocabularyId;
        this.vocabulary = vocabulary;
        this.englishMean = englishMean;
        this.vietnameseMean = vietnameseMean;
        this.partOfSpeechId = partOfSpeechId;
        this.courseId = courseId;
        this.thumbnailImage = thumbnailImage;
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

    @Override
    public String toString() {
        return "Vocabulary{" +
                "vocabularyId=" + vocabularyId +
                ", vocabulary='" + vocabulary + '\'' +
                ", englishMean='" + englishMean + '\'' +
                ", vietnameseMean='" + vietnameseMean + '\'' +
                ", partOfSpeechId='" + partOfSpeechId + '\'' +
                ", courseId='" + courseId + '\'' +
                ", thumbnailImage='" + thumbnailImage + '\'' +
                '}';
    }
}
