package com.bd2.proj.repositories;

import com.bd2.proj.model.UtenteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends MongoRepository<UtenteModel, String> {
    List<UtenteModel> findByEmail(String email);
}
