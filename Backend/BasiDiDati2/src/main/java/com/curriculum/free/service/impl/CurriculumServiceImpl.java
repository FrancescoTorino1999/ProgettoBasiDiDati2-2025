package com.curriculum.free.service.impl;

import com.curriculum.free.dao.CurriculumDao;
import com.curriculum.free.model.CurriculumVitae;
import com.curriculum.free.service.CurriculumService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculumServiceImpl implements CurriculumService {

    @Autowired
    private CurriculumDao curriculumDao;

    @Override
    public boolean insertCv(String jsonString) {
        try {
            // Use a JSON parsing library (e.g., ObjectMapper from Jackson)
            ObjectMapper mapper = new ObjectMapper();
            CurriculumVitae cv = mapper.readValue(jsonString, CurriculumVitae.class);

            // Call DAO to insert the parsed object
            return curriculumDao.insertCv(cv);
        } catch (JsonProcessingException e) {
            // Handle JSON parsing errors (e.g., invalid format)
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<CurriculumVitae> getAllCurriculumEn() {
        return curriculumDao.getAllCurriculumEn();
    }

    @Override
    public Optional<CurriculumVitae> getCurriculumByIdEn(Long id) {
        return curriculumDao.getCurriculumByIdEn(id);
    }


}
