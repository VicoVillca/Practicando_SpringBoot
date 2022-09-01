package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table (name = "estudiante")
@ToString
public class Estudiante {
    @Id
    @Getter @Setter
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private int edad;

    @Getter @Setter
    private String correo;

    @Getter @Setter
    private String contraseña;

}
