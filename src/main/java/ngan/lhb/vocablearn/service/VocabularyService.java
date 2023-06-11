package ngan.lhb.vocablearn.service;

import ngan.lhb.vocablearn.dto.VocabularyDto;
import ngan.lhb.vocablearn.entity.Vocabulary;
import ngan.lhb.vocablearn.repository.VocabularyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VocabularyService implements CommonService<VocabularyDto>{
    private final VocabularyRepository vocabularyRepository;

    @Autowired
    public VocabularyService(VocabularyRepository vocabularyRepository){
        this.vocabularyRepository = vocabularyRepository;
    }


    @Override
    public List<VocabularyDto> getAll() {
        List<ngan.lhb.vocablearn.entity.Vocabulary> listVocab = vocabularyRepository.findAll();
        List<VocabularyDto> listVocabConvert = new ArrayList<>();
        for (ngan.lhb.vocablearn.entity.Vocabulary vocab : listVocab) {
            VocabularyDto temp = entityToDto(vocab);
            listVocabConvert.add(temp);
        }
        return listVocabConvert;
    }

    public VocabularyDto entityToDto (Vocabulary vocabulary){
        return new VocabularyDto(
                vocabulary.getVocabularyId()
                , vocabulary.getVocabulary()
                , vocabulary.getEnglishMean()
                , vocabulary.getVietnameseMean()
                , vocabulary.getPartOfSpeech().getPartOfSpeechId()
                , vocabulary.getCourse().getCourseId()
                , vocabulary.getThumbnailImage()
                , vocabulary.getThumbnailImage()
                , vocabulary.isDeleteFlag()
                , vocabulary.getCreateDate()
                , vocabulary.getUpdateDate()
        );
    }

    @Override
    public VocabularyDto getById(Long id) {
        return null;
    }

    @Override
    public void update(VocabularyDto vocabularyDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public VocabularyDto add(VocabularyDto vocabularyDto) {
        return null;
    }
}
