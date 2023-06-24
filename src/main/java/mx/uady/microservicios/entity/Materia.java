package mx.uady.microservicios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {

	@Id
	@Column(name="identificador")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="nombreMateria")
	private String nombreMateria;
	
	public Materia(int id, String nombreMateria) {
		this.id = id;
		this.nombreMateria = nombreMateria;
	}

	public Materia() {
		
	}
	
	public Materia(String nombreMateria) {
		this.nombreMateria=nombreMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
}
