package com.curriculum.free.controller;

import com.curriculum.free.model.PathMenuModel;
import com.curriculum.free.service.GetLabelForPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetLabelForPageController {

    @Autowired
    private GetLabelForPageService getLabelForPageService;

    @GetMapping("/getLabelForMenu")
    public List<PathMenuModel> getLabelForMenu () {

        return getLabelForPageService.getLabelForMenu();

    }

}
