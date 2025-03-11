package com.curriculum.free.repositories;

import com.curriculum.free.model.PathMenuModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MenuLabelRepository extends JpaRepository<PathMenuModel, Long> {
}
