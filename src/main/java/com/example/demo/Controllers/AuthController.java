package com.example.demo.Controllers;

import com.example.demo.Models.Estudiante;
import com.example.demo.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@RestController
public class AuthController {
    @Autowired
    private EstudianteRepository estudianteRepository;


    @GetMapping(value = "api/authenticate")
    public String Login(@RequestBody Estudiante estudiante){
        System.out.println("Login");
        String query ="";
        //entityManager.createQuery(query);
        System.out.println("saludo wee");
        return "Hello World";

    }
}
