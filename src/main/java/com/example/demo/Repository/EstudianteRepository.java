package com.example.demo.Repository;

import com.example.demo.Models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {

    Estudiante findByEmail(String email);
}
