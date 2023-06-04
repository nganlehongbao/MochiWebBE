package ngan.lhb.vocablearn.repository;

import ngan.lhb.vocablearn.entity.Vocabulary;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VocabularyRepository extends JpaRepository<Vocabulary, Long> {
//    List<Vocabulary> findAll(Pageable pageable);

}
