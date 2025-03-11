package com.curriculum.free.service.impl;

import com.curriculum.free.dao.GetLabelDao;
import com.curriculum.free.model.PathMenuModel;
import com.curriculum.free.service.GetLabelForPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetLabelForPageServiceImpl implements GetLabelForPageService {

    @Autowired
    private GetLabelDao getLabelDao;

    @Override
    public List<PathMenuModel> getLabelForMenu() {

        return getLabelDao.getLabelForMenu();

    }
}
