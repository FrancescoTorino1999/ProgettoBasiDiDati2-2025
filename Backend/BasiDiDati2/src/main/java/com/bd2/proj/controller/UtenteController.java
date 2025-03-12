package com.bd2.proj.controller;

import com.bd2.proj.model.UtenteModel;
import com.bd2.proj.service.impl.UtenteModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtenteController {

    @Autowired
    private UtenteModelService UtenteModelService;

    @GetMapping("/findUtente")
    public ResponseEntity<UtenteModel> getUtenteModelByEmail(@RequestParam String email) {
        UtenteModel UtenteModel = UtenteModelService.findByEmail(email);

        if (UtenteModel != null) {
            return ResponseEntity.ok(UtenteModel);
        } else {
            return ResponseEntity.ok(new UtenteModel());
        }
    }
}