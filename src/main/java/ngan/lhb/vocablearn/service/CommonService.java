package ngan.lhb.vocablearn.service;

import java.util.List;

public interface CommonService<T> {
    List<T> getAll();
    T getById(Long id);
    void update(T t);
    void delete(Long id);
    void add(T t);
}
