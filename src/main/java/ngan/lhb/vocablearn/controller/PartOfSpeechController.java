package ngan.lhb.vocablearn.controller;

import ngan.lhb.vocablearn.dto.CourseDto;
import ngan.lhb.vocablearn.dto.PartOfSpeechDto;
import ngan.lhb.vocablearn.dto.VocabularyDto;
import ngan.lhb.vocablearn.response_dto.RspGetList;
import ngan.lhb.vocablearn.service.PartOfSpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/part-of-speech")
public class PartOfSpeechController {
    PartOfSpeechService partOfSpeechService;
    @Autowired
    public PartOfSpeechController(PartOfSpeechService partOfSpeechService){
        this.partOfSpeechService = partOfSpeechService;
    }

    @GetMapping
    public ResponseEntity<RspGetList> getPartOfSpeechList(){
        List<PartOfSpeechDto> partOfSpeechDtos = partOfSpeechService.getAll();
        RspGetList result = new RspGetList<VocabularyDto>();
        result.total = partOfSpeechDtos.size();
        result.list = partOfSpeechDtos;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
