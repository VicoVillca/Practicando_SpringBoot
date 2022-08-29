package com.example.demo.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "club")
@ToString
@Getter
@Setter
public class Club {
    @Id
    @Column (name = "id")
    private Integer id;

    @Column (name = "nombre")
    private String nombre;

    @OneToOne
    private  Entrenador entrenador;

    @ManyToOne
    private Asociacion asociacion;

    @OneToMany
    @JoinColumn (name = "id_club")
    private List<Jugador> jugadors;

    @ManyToMany
    private List<Competicion> competicions;

}
