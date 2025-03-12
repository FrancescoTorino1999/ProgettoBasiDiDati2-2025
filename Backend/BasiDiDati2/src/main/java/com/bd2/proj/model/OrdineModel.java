package com.bd2.proj.model;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

public class OrdineModel {

    public OrdineModel(String dataOrdine, String stato, List<ArticoloModel> articoli) {
        this.dataOrdine = dataOrdine;
        this.stato = stato;
        this.articoli = articoli;
    }

    public OrdineModel() {
    }

    @Field("data_ordine")
    private String dataOrdine;

    private String stato;
    private List<ArticoloModel> articoli;

    // Getters e Setters

    public String getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(String dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public List<ArticoloModel> getArticoli() {
        return articoli;
    }

    public void setArticoli(List<ArticoloModel> articoli) {
        this.articoli = articoli;
    }
}
