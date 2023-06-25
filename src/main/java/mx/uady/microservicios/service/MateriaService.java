package mx.uady.microservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.repository.MateriaRepository;

@Service
public class MateriaService {

	@Autowired
	private MateriaRepository materiaRepository;
	
	public Materia insertarMateria(Materia materia) {
		return materiaRepository.save(materia);
	}
	public List<Materia> getAllMaterias(){
		return materiaRepository.findAll();
	}
}
