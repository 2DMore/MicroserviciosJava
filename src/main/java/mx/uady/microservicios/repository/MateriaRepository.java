package mx.uady.microservicios.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import mx.uady.microservicios.entity.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer>{
    
}
