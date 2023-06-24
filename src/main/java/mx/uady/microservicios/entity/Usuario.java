package mx.uady.microservicios.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name ="usuario")
public class Usuario {
	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	public Usuario(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Usuario(String nombre) {
		this.nombre = nombre;
	}

	public Usuario() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Id: "+getId() +" Nombre: "+ getNombre();
	}
	
}
