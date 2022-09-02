package com.example.demo.Controllers;

import com.example.demo.Models.Estudiante;
import com.example.demo.Repository.EstudianteRepository;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;
    @GetMapping(value = "api/estudiante")
    public Iterator<Estudiante> getAll(){
        System.out.println("Se ejecuto bien la petición");
        System.out.println(estudianteRepository.findAll());
        return  estudianteRepository.findAll().iterator();
    }

    @GetMapping(value = "api/estudiante/{id}")
    public Estudiante getById(@PathVariable Integer id){
        System.out.println("Buscamos estudiante por id = "+id);
        if(estudianteRepository.existsById(id)){
            return estudianteRepository.findById(id).get();
        }else{
            System.out.println("no existe el estudiante");
            return null;
        }
    }


    @PostMapping(value = "api/estudiante")
    public void insert(@RequestBody Estudiante estudiante){
        System.out.println("Insertamos a variables weee");
        System.out.println(estudiante);
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String has = argon2.hash(1,1024,1,estudiante.getContraseña().getBytes());
        estudiante.setContraseña(has);
        estudianteRepository.save(estudiante);
    }


    @PutMapping(value = "api/estudiante/{id}")
    public void Update(@PathVariable Integer id,@RequestBody Estudiante estudiante){
        System.out.println("Editamos Variables");
        if(estudianteRepository.existsById(id)){
            Estudiante est = estudianteRepository.findById(id).get();
            est.setNombre(estudiante.getNombre());
            est.setEdad(estudiante.getEdad());
            est.setCorreo(estudiante.getCorreo());
            est.setContraseña(estudiante.getContraseña());
            System.out.println(est);
            estudianteRepository.save(est);
        }else{
            System.out.println("estudiante no se puede encontrar");
        }
    }
    @DeleteMapping(value = "api/estudiante/{id}")
    public void Delete(@PathVariable Integer id){
        System.out.println("Editamos Variables");
        if(estudianteRepository.existsById(id)){
            Estudiante estudiante = estudianteRepository.findById(id).get();
            estudianteRepository.delete(estudiante);
        }else{
            System.out.println("estudiante no se puede encontrar");
        }
    }




}
