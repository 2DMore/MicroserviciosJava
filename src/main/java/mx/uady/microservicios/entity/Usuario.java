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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad")
	private int edad;
	
	@Column(name="sexo")
	private boolean sexo;
	
	public Usuario(int id, String nombre, int edad, boolean sexo) {
		this.id = id;
		this.nombre = nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public Usuario(String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad=edad;
		this.sexo=sexo;
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
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSexo() {
		return sexo;
	}
	
	public String getSexo(){
		if (this.sexo) {
			return "Masculino";
		}else {
			return "Femenino";
		}
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Id: "+getId() +" Nombre: "+ getNombre() +" Edad: "+ getEdad()+" Sexo: " + getSexo();
	}
	

	
	
}
