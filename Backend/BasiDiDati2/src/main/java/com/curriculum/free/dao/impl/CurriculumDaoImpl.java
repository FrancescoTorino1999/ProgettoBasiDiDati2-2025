package com.curriculum.free.dao.impl;

import com.curriculum.free.dao.CurriculumDao;
import com.curriculum.free.model.CurriculumVitae;
import com.curriculum.free.repositories.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CurriculumDaoImpl implements CurriculumDao {

    @Autowired
    private CurriculumRepository curriculumRepository;

    @Override
    public boolean insertCv(CurriculumVitae input) {
        try {
            input.formatStrings();
            curriculumRepository.save(input);
            return true; // Return true on successful insert
        } catch (Exception e) {
            // Log the exception for debugging purposes
            e.printStackTrace();
            return false; // Return false on failure
        }
    }

    @Override
    public List<CurriculumVitae> getAllCurriculumEn() {
        try {
            return curriculumRepository.findAll();
        } catch (Exception e) {
            // Log the exception for debugging purposes
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Optional<CurriculumVitae> getCurriculumByIdEn(Long id) {
        try {
            return curriculumRepository.findById(id);
        } catch (Exception e) {
            // Log the exception for debugging purposes
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
