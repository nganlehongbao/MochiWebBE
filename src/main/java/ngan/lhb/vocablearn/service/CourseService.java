package ngan.lhb.vocablearn.service;

import ngan.lhb.vocablearn.entity.Course;
import ngan.lhb.vocablearn.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService implements CommonService<Course>{
    CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    };

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(Long id) {
        return null;
    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void add(Course course) {

    }
}
