package mx.uady.microservicios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="materias")
public class Materia {

	@Id
	@Column(name="clavematerias")
	private String claveMateria;
	
	@Column(name="materia")
	private String nombreMateria;
	
	@Column(name="semestre")
	private int semestre;
	
	@Column(name="licenciatura")
	private String licenciatura;
	
	public Materia(String claveMateria, String nombreMateria, int semestre, String licenciatura) {
		this.claveMateria = claveMateria;
		this.nombreMateria = nombreMateria;
		this.semestre=semestre;
		this.licenciatura=licenciatura;
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
	
	public String getClaveMateria() {
		return claveMateria;
	}

	public void setClaveMateria(String claveMateria) {
		this.claveMateria = claveMateria;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public String getLicenciatura() {
		return licenciatura;
	}

	public void setLicenciatura(String licenciatura) {
		this.licenciatura = licenciatura;
	}

	@Override
	public String toString() {
		return "Clave: "+getClaveMateria() +" Nombre: "+ getNombreMateria() +" Semestre: "
	+ getSemestre()+" Licenciatura: " + getLicenciatura();
	}
	
}
