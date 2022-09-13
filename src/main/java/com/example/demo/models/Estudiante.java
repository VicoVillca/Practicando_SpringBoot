package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@Table (name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    @Setter @Getter
    private Integer id;

    @Setter @Getter
    @Column (name = "nombre")
    private String nombre;
}
