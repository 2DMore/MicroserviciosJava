package mx.uady.microservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.microservicios.entity.Usuario;
import mx.uady.microservicios.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario insertarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	public List<Usuario> getAllUsuarios(){
		return usuarioRepository.findAll();
	}
}
