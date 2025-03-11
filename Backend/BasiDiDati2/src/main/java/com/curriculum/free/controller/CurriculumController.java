package com.curriculum.free.controller;

import com.curriculum.free.model.CurriculumVitae;
import com.curriculum.free.model.PathMenuModel;
import com.curriculum.free.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurriculumController {

    @Autowired
    private CurriculumService curriculumService;

    @PostMapping("/insertCv")
    public boolean insertCv (@RequestBody String body) {

        return curriculumService.insertCv(body);

    }

    @GetMapping("/getAllCurriculumEn")
    public List<CurriculumVitae> getAllCurriculumEn () {

        return curriculumService.getAllCurriculumEn();

    }

    @GetMapping("/getAllCurriculumByIdEn")
    public CurriculumVitae getAllCurriculumByIdEn(@RequestParam Long id) {
        try {
            return curriculumService.getCurriculumByIdEn(id).get();
        } catch (Exception e) {
            return new CurriculumVitae();
        }
    }

}
