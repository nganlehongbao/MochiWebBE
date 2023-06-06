package ngan.lhb.vocablearn.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import ngan.lhb.vocablearn.entity.Vocabulary;

import java.util.ArrayList;
import java.util.List;

public class CourseDto {
    private Long courseId;
    private String courseName;
    List<VocabularyDto> vocabularyList = new ArrayList<>();

    public CourseDto(){}

    public CourseDto(Long courseId, String courseName, List<VocabularyDto> vocabularyList) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.vocabularyList = vocabularyList;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<VocabularyDto> getVocabularyList() {
        return vocabularyList;
    }

    public void setVocabularyList(List<VocabularyDto> vocabularyList) {
        this.vocabularyList = vocabularyList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
