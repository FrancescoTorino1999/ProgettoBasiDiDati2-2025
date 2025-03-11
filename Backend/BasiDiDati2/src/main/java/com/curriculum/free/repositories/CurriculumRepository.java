package com.curriculum.free.repositories;

import com.curriculum.free.model.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurriculumRepository  extends JpaRepository<CurriculumVitae, Long> {
}
