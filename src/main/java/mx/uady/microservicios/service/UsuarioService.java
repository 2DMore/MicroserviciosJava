package mx.uady.microservicios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.microservicios.entity.Materia;
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
	public Usuario buscarUsuario (int id) {
		List<Usuario> lUsuario= getAllUsuarios();
		for (Usuario user : lUsuario) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	public void agregarMapeoMateria(Usuario user,Materia mat) {
		user.getMapMateria().add(mat);
	}
	
}
