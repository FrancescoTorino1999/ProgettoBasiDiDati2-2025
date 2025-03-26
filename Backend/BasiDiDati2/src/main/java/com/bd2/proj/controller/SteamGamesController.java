package com.bd2.proj.controller;

import com.bd2.proj.constants.Constants;
import com.bd2.proj.model.SteamGameModel;
import com.bd2.proj.service.impl.SteamGamesModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SteamGamesController {

    @Autowired
    private SteamGamesModelService steamGamesModelService;

    @GetMapping("/findAllSteamgames")
    public ResponseEntity<ArrayList<SteamGameModel>> findAll() {
        ArrayList<SteamGameModel> steamGameModels = steamGamesModelService.findAll();

        return ResponseEntity.ok(steamGameModels);

    }

    @GetMapping("/findAllSteamgamesByPage")
    public ResponseEntity<ArrayList<SteamGameModel>> findAllSteamgamesByPage(@RequestParam String page) {
        int pageNumber = Integer.parseInt(page) - 1;  // La pagina 1 corrisponde a 0 in paginazione, quindi -1

        ArrayList<SteamGameModel> steamGameModels = steamGamesModelService.findAllPaginated(pageNumber, Constants.PAGE_SIZE);

        return ResponseEntity.ok(steamGameModels);

    }

}