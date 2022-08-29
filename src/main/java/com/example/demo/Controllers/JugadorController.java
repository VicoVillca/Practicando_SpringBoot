package com.example.demo.Controllers;

import com.example.demo.Models.Club;
import com.example.demo.Models.Jugador;
import com.example.demo.Repository.ClubRepositoty;
import com.example.demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JugadorController {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private ClubRepositoty clubRepositoty;

    @GetMapping(value = "/saludo")
    public Club  getAll(){


        System.out.println(jugadorRepository.findAll());

        return  clubRepositoty.findById(1).get();

    }
}
