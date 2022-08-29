package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "jugador")
@ToString @Getter @Setter
public class Jugador {

    @Id
    @Column (name = "id")
    private Integer id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "apellido")
    private String apellido;
}
