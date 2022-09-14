package com.example.demo.dao;

import com.example.demo.models.Estudiante;
import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudianteRepository  extends JpaRepository<Estudiante,Integer> {
    Usuario findByNombre(String nombre);
}
