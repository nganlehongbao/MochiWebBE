package ngan.lhb.vocablearn.service;

import ngan.lhb.vocablearn.dto.CourseDto;

import java.util.List;

public interface CommonService<T> {
    List<T> getAll();
    T getById(Long id);
    void update(T t);
    void delete(Long id);
    T add(T t);
}
