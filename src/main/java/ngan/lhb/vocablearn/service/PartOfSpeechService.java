package ngan.lhb.vocablearn.service;

import ngan.lhb.vocablearn.dto.PartOfSpeechDto;
import ngan.lhb.vocablearn.entity.PartOfSpeech;
import ngan.lhb.vocablearn.repository.PartOfSpeechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PartOfSpeechService implements CommonService<PartOfSpeechDto> {
    PartOfSpeechRepository partOfSpeechRepository;
    @Autowired
    public PartOfSpeechService(PartOfSpeechRepository partOfSpeechRepository){
        this.partOfSpeechRepository = partOfSpeechRepository;
    }

    public PartOfSpeechDto entityToDto (PartOfSpeech partOfSpeech){
        return new PartOfSpeechDto(
                partOfSpeech.getPartOfSpeechId()
                , partOfSpeech.getName()
                , partOfSpeech.getAcronym()
        );
    }

    public PartOfSpeech dtoToEntity(PartOfSpeechDto partOfSpeechDto){
        return new PartOfSpeech(
                partOfSpeechDto.getPartOfSpeechId()
                , partOfSpeechDto.getName()
                , partOfSpeechDto.getAcronym()
        );
    }

    @Override
    public List<PartOfSpeechDto> getAll() {
        List<PartOfSpeech> partOfSpeeches = partOfSpeechRepository.findAll();
        List<PartOfSpeechDto> partOfSpeechDtos = new ArrayList<>();
        for (PartOfSpeech partOfSpeech : partOfSpeeches) {
            PartOfSpeechDto partOfSpeechDto = entityToDto(partOfSpeech);
            partOfSpeechDtos.add(partOfSpeechDto);
        }
        return partOfSpeechDtos;
    }

    @Override
    public PartOfSpeechDto getById(Long id) {
        return null;
    }

    @Override
    public void update(PartOfSpeechDto partOfSpeechDto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PartOfSpeechDto add(PartOfSpeechDto partOfSpeechDto) {
        return null;
    }
}
