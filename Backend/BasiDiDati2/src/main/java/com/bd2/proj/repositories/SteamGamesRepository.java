package com.bd2.proj.repositories;

import com.bd2.proj.model.SteamGameModel;
import com.bd2.proj.model.UtenteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SteamGamesRepository  extends MongoRepository<SteamGameModel, String> {
}
