package mx.uady.microservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mx.uady.microservicios.entity.Materia;
import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.repository.MateriaRepository;
import mx.uady.microservicios.repository.UsuarioRepository;
import mx.uady.microservicios.service.UsuarioService;

@SpringBootApplication
public class TestApplication implements  CommandLineRunner{
	
	@Autowired
	private UsuarioService usuarioService;
	
	/*@Autowired
	private UsuarioRepository repository;
	
	@Autowired
	private MateriaRepository matRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println("Hola Mundo");
	}
	
	
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("public void run");
		Usuario usuario= new Usuario("Daniel");
		//Materia materia=new Materia("POO");
		//repository.save(usuario);
		System.out.println(usuarioService.insertarUsuario(usuario));
		System.out.println(usuarioService.insertarUsuario(new Usuario("Pancho")));
		System.out.println("Registros insertados: "+ usuarioService.getAllUsuarios().toString());
	}
}
