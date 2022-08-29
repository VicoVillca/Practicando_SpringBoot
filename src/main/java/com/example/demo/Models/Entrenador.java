package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "entrenador")
@ToString @Getter @Setter
public class Entrenador {
    @Id
    @Column (name = "id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String  apellido;

    @Column (name = "edad")
    private int edad;

    @Column (name = "nacionalidad")
    private String nacionalidad;
}
