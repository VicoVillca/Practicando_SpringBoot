package com.example.demo.dao;

import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario findByEmail(String email);
    Usuario findByTelefono(String telefono);

    Usuario findByNombre(String nombre);
    Usuario findByApellido(String apellido);

    @Query("SELECT u FROM Usuario u WHERE u.nombre = :nombre and u.apellido = :apellido")
    Usuario findUserByStatusAndName( @Param("nombre") Integer nombre,  @Param("apellido") Integer apellido);

    @Query("SELECT u FROM Usuario u WHERE u.nombre = :nombre and u.apellido = :apellido")
    Usuario findUserByStadodeUsuario( @Param("nombre") Integer nombre,  @Param("apellido") Integer apellido);
    //realizamos un comentario
}
