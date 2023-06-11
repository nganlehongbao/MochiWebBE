package ngan.lhb.vocablearn.repository;

import ngan.lhb.vocablearn.entity.PartOfSpeech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartOfSpeechRepository extends JpaRepository<PartOfSpeech, Long> {
}
