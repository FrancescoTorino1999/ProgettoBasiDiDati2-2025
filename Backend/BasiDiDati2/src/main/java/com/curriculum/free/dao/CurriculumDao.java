package com.curriculum.free.dao;

import com.curriculum.free.model.CurriculumVitae;

import java.util.List;
import java.util.Optional;

public interface CurriculumDao {

    boolean insertCv(CurriculumVitae input);

    List<CurriculumVitae> getAllCurriculumEn();

    Optional<CurriculumVitae> getCurriculumByIdEn(Long id);
}
