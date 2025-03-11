package com.curriculum.free.service;

import com.curriculum.free.model.CurriculumVitae;

import java.util.List;
import java.util.Optional;

public interface CurriculumService {

    boolean insertCv(String input);

    List<CurriculumVitae> getAllCurriculumEn();

    Optional<CurriculumVitae> getCurriculumByIdEn(Long id);

}
