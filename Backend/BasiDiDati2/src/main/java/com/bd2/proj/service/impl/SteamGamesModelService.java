package com.bd2.proj.service.impl;

import com.bd2.proj.model.SteamGameModel;
import com.bd2.proj.model.UtenteModel;
import com.bd2.proj.repositories.SteamGamesRepository;
import com.bd2.proj.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SteamGamesModelService {

    @Autowired
    private SteamGamesRepository steamGamesRepository;

    public ArrayList<SteamGameModel> findAll() {
        return (ArrayList<SteamGameModel>) steamGamesRepository.findAll();
    }

    public ArrayList<SteamGameModel> findAllPaginated(int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);

        Page<SteamGameModel> steamGamePage = steamGamesRepository.findAll(pageRequest);

        return new ArrayList<>(steamGamePage.getContent());
    }
}