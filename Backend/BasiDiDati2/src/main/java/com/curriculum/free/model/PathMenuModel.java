package com.curriculum.free.model;

import com.curriculum.free.constants.Constants;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= Constants.TABLE_PATH_MENU_VALUE, schema = Constants.SCHEMA_CV)
public class PathMenuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "path", nullable=false)
    @JsonProperty("path")
    private String path;

    @Column(name= "label", nullable=false)
    @JsonProperty("label")
    private String label;

}

