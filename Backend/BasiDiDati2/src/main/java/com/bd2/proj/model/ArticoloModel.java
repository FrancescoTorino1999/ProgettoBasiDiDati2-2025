package com.bd2.proj.model;

import lombok.AllArgsConstructor;

public class ArticoloModel {

    private String nome;
    private int quantita;
    private double prezzo;

    public ArticoloModel(String nome, int quantita, double prezzo) {
        this.nome = nome;
        this.quantita = quantita;
        this.prezzo = prezzo;
    }

    public ArticoloModel() {
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
