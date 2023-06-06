package ngan.lhb.vocablearn.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "COURSE")
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COURSE_ID")
    private Long courseId;

    @Column(name = "COURSE_NAME" )
    private String courseName;

    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
    List<Vocabulary> vocabularyList = new ArrayList<>();

    public Course(){}

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public Course(Long courseId, String courseName, List<Vocabulary> vocabularyList) {
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

    @JsonManagedReference
    public List<Vocabulary> getVocabularyList() {
        return vocabularyList;
    }

    public void setVocabularyList(List<Vocabulary> vocabularyList) {
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
