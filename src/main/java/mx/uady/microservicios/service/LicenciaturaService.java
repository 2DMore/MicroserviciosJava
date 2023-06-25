package mx.uady.microservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.microservicios.entity.Licenciatura;
import mx.uady.microservicios.repository.LicenciaturaRepository;

@Service
public class LicenciaturaService {
	@Autowired
	private LicenciaturaRepository licenciaturaRepository;
	
	public Licenciatura insertarLicenciatura(Licenciatura licenciatura) {
		return licenciaturaRepository.save(licenciatura);
	}
	public List<Licenciatura> getAllLicenciaturas(){
		return licenciaturaRepository.findAll();
	}
}
