package com.example.demo.Repository;

import com.example.demo.Models.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.persistence.EntityManager;
import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante,Integer> {

    Estudiante findByCorreo(String email);
    Estudiante findByNombre(String email);

    @Query("select e from Estudiante e where e.edad= :edad ")
    public List<Estudiante> find(@Param("edad") Integer edad);

    @Query("select e from Estudiante e where e.correo= :correo and e.contraseña= :contraseña ")
    public List<Estudiante> findLogin(@Param("correo") String correo,@Param("contraseña") String Contraseña);


}
