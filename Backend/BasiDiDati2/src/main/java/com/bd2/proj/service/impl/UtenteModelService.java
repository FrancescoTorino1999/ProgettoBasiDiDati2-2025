package com.bd2.proj.service.impl;

import com.bd2.proj.repositories.UtenteRepository;
import com.bd2.proj.model.UtenteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteModelService {

    @Autowired
    private UtenteRepository utenteModelRepository;

    public UtenteModel findByEmail(String email) {
        return utenteModelRepository.findByEmail(email).stream().findFirst().orElse(null);
    }


    public UtenteModel creaNuovoUtente(UtenteModel utente) {
        return utenteModelRepository.save(utente);
    }
}