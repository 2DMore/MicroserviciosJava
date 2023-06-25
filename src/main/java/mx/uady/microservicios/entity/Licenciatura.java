package mx.uady.microservicios.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="licenciatura")
public class Licenciatura {
	
	@Id
	@Column(name="clvlicenciatura")
	private String claveLicenciatura;
	
	@Column(name="nombrelicenciatura")
	private String nombreLicenciatura;
	
	@Column(name="semestres")
	private int semestres;

	public Licenciatura(String claveLicenciatura, String nombreLicenciatura, int semestres) {
		this.claveLicenciatura = claveLicenciatura;
		this.nombreLicenciatura = nombreLicenciatura;
		this.semestres = semestres;
	}

	public Licenciatura() {
	}

	public String getClaveLicenciatura() {
		return claveLicenciatura;
	}

	public void setClaveLicenciatura(String claveLicenciatura) {
		this.claveLicenciatura = claveLicenciatura;
	}

	public String getNombreLicenciatura() {
		return nombreLicenciatura;
	}

	public void setNombreLicenciatura(String nombreLicenciatura) {
		this.nombreLicenciatura = nombreLicenciatura;
	}

	public int getSemestres() {
		return semestres;
	}

	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}
	
	@Override
	public String toString() {
		return "Clave: "+ getClaveLicenciatura()+" Nombre: "
				+ getNombreLicenciatura()+" Semestres: "+ getSemestres();
	}
	
	
	
	
}
