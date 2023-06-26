package mx.uady.microservicios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.entity.Usuario;
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
	public Materia buscarMateria(String clave) {
		List<Materia> lMateria= getAllMaterias();
		for (Materia materia : lMateria) {
			if (materia.getClaveMateria().equals(clave)) {
				return materia;
			}
		}
		return null;
	}
	public void agregarMapeoUsuario (Materia mat, Usuario user) {
		mat.getMapUsuario().add(user);
	}
	
}
