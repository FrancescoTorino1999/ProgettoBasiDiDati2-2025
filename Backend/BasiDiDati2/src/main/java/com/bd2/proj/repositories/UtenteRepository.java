package com.bd2.proj.repositories;

import com.bd2.proj.model.UtenteModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UtenteRepository extends MongoRepository<UtenteModel, String> {
    List<UtenteModel> findByEmail(String email);
}
