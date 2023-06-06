package ngan.lhb.vocablearn.service;

import ngan.lhb.vocablearn.dto.CourseDto;
import ngan.lhb.vocablearn.dto.VocabularyDto;
import ngan.lhb.vocablearn.entity.Course;
import ngan.lhb.vocablearn.entity.Vocabulary;
import ngan.lhb.vocablearn.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseService implements CommonService<CourseDto>{
    CourseRepository courseRepository;
    VocabularyService vocabularyService;

    @Autowired
    public CourseService(CourseRepository courseRepository, VocabularyService vocabularyService){
        this.courseRepository = courseRepository;
        this.vocabularyService = vocabularyService;
    }

    @Override
    public List<CourseDto> getAll() {
        List<Course> courses = courseRepository.findAll();
        List<CourseDto> courseDtos = new ArrayList<>();
        for (Course course: courses) {
            courseDtos.add(entityToDto(course));
        }
        return courseDtos;
    }

    public CourseDto entityToDto(Course course){
        List<VocabularyDto> vocabularyDtoList = new ArrayList<>();
        List<Vocabulary> vocabularyList = course.getVocabularyList();
        for (Vocabulary vocabulary :
                vocabularyList) {
            vocabularyDtoList.add(vocabularyService.entityToDto(vocabulary));
        }
        return new CourseDto(
                course.getCourseId()
                , course.getCourseName()
                , vocabularyDtoList
        );
    }

    public Course dtoToEntity(CourseDto courseDto){
        return new Course(courseDto.getCourseName());
    }

    @Override
    public CourseDto getById(Long id) {
        return null;
    }

    @Override
    public void update(CourseDto course) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public CourseDto add(CourseDto courseDto) {
        Course course = dtoToEntity(courseDto);
        Course result = courseRepository.save(course);
        return entityToDto(result);
    }
}
