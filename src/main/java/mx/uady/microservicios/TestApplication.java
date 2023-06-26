package mx.uady.microservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.uady.microservicios.entity.Licenciatura;
import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.service.LicenciaturaService;
import mx.uady.microservicios.service.MateriaService;
import mx.uady.microservicios.service.UsuarioService;

@SpringBootApplication
public class TestApplication implements  CommandLineRunner{
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private MateriaService materiaService;
	
	@Autowired
	private LicenciaturaService licenciaturaService;

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println("Hola Mundo");
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("public void run");
		/*
		 Proceso para relacion entre licenciatura y materia
		Materia mat1=materiaService.buscarMateria("DA");
		Licenciatura lic1=licenciaturaService.buscarLicenciatura("LEM");
		materiaService.agregarMapeoLicenciatura(mat1, lic1);
		licenciaturaService.agregarMapeoMateria(lic1, mat1);
		System.out.println(materiaService.insertarMateria(mat1));
		System.out.println(licenciaturaService.insertarLicenciatura(lic1));
		
		Proceso para relacion materia y usuario
		Usuario usuario=usuarioService.buscarUsuario(10);
		Materia mat2=materiaService.buscarMateria("DA");
		Materia mat3=materiaService.buscarMateria("IE");
		Materia mat4=materiaService.buscarMateria("LRT");
		
		usuarioService.agregarMapeoMateria(usuario, mat2);
		usuarioService.agregarMapeoMateria(usuario, mat3);
		usuarioService.agregarMapeoMateria(usuario, mat4);
		materiaService.agregarMapeoUsuario(mat2, usuario);
		materiaService.agregarMapeoUsuario(mat3, usuario);
		materiaService.agregarMapeoUsuario(mat4, usuario);
		
		System.out.println(usuarioService.insertarUsuario(usuario));
		
		System.out.println(materiaService.insertarMateria(mat2));
		System.out.println(materiaService.insertarMateria(mat3));
		System.out.println(materiaService.insertarMateria(mat4));
		*/
		
	}
}
