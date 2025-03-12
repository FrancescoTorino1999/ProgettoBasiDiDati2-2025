package com.bd2.proj.controller;

import com.bd2.proj.model.ArticoloModel;
import com.bd2.proj.model.OrdineModel;
import com.bd2.proj.model.UtenteModel;
import com.bd2.proj.service.impl.UtenteModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UtenteController {

    @Autowired
    private UtenteModelService utenteModelService;

    @GetMapping("/findUtente")
    public ResponseEntity<UtenteModel> getUtenteModelByEmail(@RequestParam String email) {
        UtenteModel UtenteModel = utenteModelService.findByEmail(email);

        if (UtenteModel != null) {
            return ResponseEntity.ok(UtenteModel);
        } else {
            return ResponseEntity.ok(new UtenteModel());
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<ArrayList<UtenteModel>> findAll() {
        ArrayList<UtenteModel> UtenteModel = utenteModelService.findAll();

        return ResponseEntity.ok(UtenteModel);

    }

    @GetMapping("/createUtente")
    public ResponseEntity<List<UtenteModel>> createUtente() {

        // Utente 1
        UtenteModel utente1 = new UtenteModel();
        utente1.setNome("Maria");
        utente1.setCognome("Bianchi");
        utente1.setEmail("maria.bianchi@yahoo.com");
        utente1.setIndirizzo("Via Torino 3, Milano, 20100, Italia");
        utente1.setOrdini(Arrays.asList(new OrdineModel("2024-01-25T11:15:00Z", "In Elaborazione", Arrays.asList(new ArticoloModel("Tappetino Yoga", 1, 29.90), new ArticoloModel("Frullatore", 1, 60.00)))));

        // Utente 2
        UtenteModel utente2 = new UtenteModel();
        utente2.setNome("Luca");
        utente2.setCognome("Rossi");
        utente2.setEmail("luca.rossi@gmail.com");
       utente2.setIndirizzo("Via Milano 22, Roma, 00100, Italia");
        utente2.setOrdini(Arrays.asList(new OrdineModel("2024-01-15T16:30:00Z", "Spedito", Arrays.asList(new ArticoloModel("Fotocamera Reflex", 1, 159.99)))));

        // Utente 3
        UtenteModel utente3 = new UtenteModel();
        utente3.setNome("Giulia");
        utente3.setCognome("Verdi");
        utente3.setEmail("giulia.verdi@gmail.com");
         utente3.setIndirizzo("Via Firenze 10, Napoli, 80100, Italia");
        utente3.setOrdini(Arrays.asList(new OrdineModel("2024-02-10T14:00:00Z", "Spedito", Arrays.asList(new ArticoloModel("Set di Coltelli", 1, 49.99), new ArticoloModel("Robot da Cucina", 1, 50.00)))));

        // Utente 4
        UtenteModel utente4 = new UtenteModel();
        utente4.setNome("Marco");
        utente4.setCognome("Bianchi");
        utente4.setEmail("marco.bianchi@outlook.com");
        utente4.setIndirizzo("Viale dei Pini 15, Milano, 20121, Italia");
        utente4.setOrdini(Arrays.asList(new OrdineModel("2024-03-05T18:00:00Z", "In Elaborazione", Arrays.asList(new ArticoloModel("Smartphone X", 1, 599.99), new ArticoloModel("Cuffie Bluetooth", 1, 50.00)))));

        // Utente 5
        UtenteModel utente5 = new UtenteModel();
        utente5.setNome("Laura");
        utente5.setCognome("Neri");
        utente5.setEmail("laura.neri@gmail.com");
      utente5.setIndirizzo("Via Verona 7, Torino, 10100, Italia");
        utente5.setOrdini(Arrays.asList(new OrdineModel("2024-02-28T10:15:00Z", "Spedito", Arrays.asList(new ArticoloModel("Opera d'Arte", 1, 50.00), new ArticoloModel("Set di Pennelli", 1, 24.50)))));

        // Salva gli utenti
        utenteModelService.creaNuovoUtente(utente1);
        utenteModelService.creaNuovoUtente(utente2);
        utenteModelService.creaNuovoUtente(utente3);
        utenteModelService.creaNuovoUtente(utente4);
        utenteModelService.creaNuovoUtente(utente5);

        List<UtenteModel> utenti = Arrays.asList(utente1, utente2, utente3, utente4, utente5);

        return ResponseEntity.ok(utenti);
    }
}