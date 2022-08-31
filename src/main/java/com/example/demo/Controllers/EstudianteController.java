package com.example.demo.Controllers;

import com.example.demo.Models.Estudiante;
import com.example.demo.Repository.EstudianteRepository;
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
        System.out.println("insertamso variables weee");
        System.out.println(estudiante);
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
