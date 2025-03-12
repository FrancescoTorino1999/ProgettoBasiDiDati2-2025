package com.bd2.proj.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "utente")
public class UtenteModel {

    @Id
    private String id;

    private String nome;
    private String cognome;
    private String email;
    private String indirizzo;
    private List<OrdineModel> ordini;

    // Getters e Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public List<OrdineModel> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<OrdineModel> ordini) {
        this.ordini = ordini;
    }
}
