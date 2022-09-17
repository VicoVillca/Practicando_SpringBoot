package com.example.demo.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name  = "colegio")
@ToString
public class Colegios {
    @Id
    @Column (name = "rude", unique = true)
    @Getter @Setter
    private String rude;

    @Column (name = "nombre")
    @Getter @Setter
    private String nombre;
}
