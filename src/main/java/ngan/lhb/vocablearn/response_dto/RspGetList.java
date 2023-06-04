package ngan.lhb.vocablearn.response_dto;

import ngan.lhb.vocablearn.dto.VocabularyDto;

import java.util.List;

public class RspGetList<T> {
    public int total;
    public int maxPage;
    public int itemPerPage;
    public int currentPage;
    public List<T> list;
}
