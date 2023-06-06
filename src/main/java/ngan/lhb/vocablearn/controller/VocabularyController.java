package ngan.lhb.vocablearn.controller;

import ngan.lhb.vocablearn.dto.VocabularyDto;
import ngan.lhb.vocablearn.response_dto.RspGetList;
import ngan.lhb.vocablearn.service.CourseService;
import ngan.lhb.vocablearn.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VocabularyController {
    VocabularyService vocabularyService;

    @Autowired
    public VocabularyController(VocabularyService vocabularyService){
        this.vocabularyService = vocabularyService;
    }

    @GetMapping("/vocabulary")
    public ResponseEntity<RspGetList> getVocabularyList(){
        List<VocabularyDto> vocabularyDtoList = vocabularyService.getAll();
        RspGetList result = new RspGetList<VocabularyDto>();
        result.total = vocabularyDtoList.size();
        result.list = vocabularyDtoList;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
