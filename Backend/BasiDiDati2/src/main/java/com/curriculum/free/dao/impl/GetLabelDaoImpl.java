package com.curriculum.free.dao.impl;

import com.curriculum.free.dao.GetLabelDao;
import com.curriculum.free.model.PathMenuModel;
import com.curriculum.free.repositories.MenuLabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetLabelDaoImpl implements GetLabelDao {

    @Autowired
    private MenuLabelRepository menuLabelRepository;

    @Override
    public List<PathMenuModel> getLabelForMenu() {

        return menuLabelRepository.findAll();

    }
}
