package com.example.demo.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "competicion")
public class Competicion {
    @Id
    @Column (name = "id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "montoPremio")
    private int montoPremio;

    @Column (name = "fechaInicio")
    private LocalDate fechInicio;

    @Column (name = "fechaFin")
    private LocalDate fechaFin;

}
