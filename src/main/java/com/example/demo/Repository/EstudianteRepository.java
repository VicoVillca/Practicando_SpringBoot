package com.example.demo.Repository;

import com.example.demo.Models.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante,Integer> {
}
