package com.example.demo.Controllers;

import com.example.demo.Models.Estudiante;
import com.example.demo.Repository.EstudianteRepository;
import com.example.demo.Utils.JWTUtil;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
public class AuthController {
    @Autowired
    private EstudianteRepository estudianteRepository;


    @Autowired
    private JWTUtil jwtUtil;

    @GetMapping(value = "api/authenticate")
    public String Login(@RequestBody Estudiante estudiante){
        Estudiante user =  estudianteRepository.findByCorreo(estudiante.getCorreo());
        if(user!=null){
            String paswordHashed = user.getContraseña();
            Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

            if(argon2.verify(paswordHashed,estudiante.getContraseña().getBytes())){
                String token = jwtUtil.create(String.valueOf(estudiante.getId()),estudiante.getCorreo());
                return token;
            }
        }
        return "FAIL";

    }
}
