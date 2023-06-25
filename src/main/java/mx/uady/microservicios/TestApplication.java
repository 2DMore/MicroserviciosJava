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
		/*Materia materia= new Materia("DCD", "Diseno de base de datos", 5, "LIS");
		System.out.println(materiaService.insertarMateria(materia));
		System.out.println(usuarioService.insertarUsuario(new Usuario("Daniel", 24, true)));
		System.out.println("Usuarios insertados: "+ usuarioService.getAllUsuarios().toString());
		System.out.println("Materias insertadas: "+ materiaService.getAllMaterias().toString());
		System.out.println(licenciaturaService.insertarLicenciatura(new Licenciatura("LA", "Licenciatura en Actuaria", 9)));
		System.out.println(licenciaturaService.insertarLicenciatura(new Licenciatura("LCC", "Licenciatura en Ciencias de la Computacion", 9)));
		System.out.println(licenciaturaService.insertarLicenciatura(new Licenciatura("LEM", "Licenciatura en Ensenanza de las Matematicas", 8)));
		System.out.println(licenciaturaService.insertarLicenciatura(new Licenciatura("LIC", "Licenciatura en Ingenieria en Computacion", 9)));
		System.out.println(licenciaturaService.insertarLicenciatura(new Licenciatura("LM", "Licenciatura en Matematicas", 8)));
		System.out.println("Licenciaturas insertadas: "+ licenciaturaService.getAllLicenciaturas().toString());*/
		
	}
}
