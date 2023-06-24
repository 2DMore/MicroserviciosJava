package mx.uady.microservicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.uady.microservicios.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
