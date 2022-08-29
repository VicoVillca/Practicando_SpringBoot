package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "asociacion")
@ToString @Getter @Setter
public class Asociacion {
    @Id
    @Column (name = "id")
    private Long id;

    @Column (name =  "nombre")
    private String nombre;

    @Column (name = "pais")
    private String pais;

    @Column (name = "presidente")
    private String presidente;


}
