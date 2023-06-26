package mx.uady.microservicios.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
	
	//Relacion Licenciatura 1:n Usuarios
	@OneToMany(mappedBy = "licenciatura")
	private Set<Usuario> mapUsuario;

	//Relacion Licenciatura m:n Materias
	@ManyToMany(cascade= CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinTable(name="oferta_materias",
			joinColumns= @JoinColumn(name="clv_licenciatura", referencedColumnName="clvlicenciatura"),
			inverseJoinColumns= @JoinColumn(name= "clv_materia", referencedColumnName="clavematerias"))
	private Set<Materia> mapMateria= new HashSet <>();

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
	
	public Set<Usuario> getMapUsuario() {
		return mapUsuario;
	}

	public void setMapUsuario(Set<Usuario> mapUsuario) {
		this.mapUsuario = mapUsuario;
	}

	public Set<Materia> getMapMateria() {
		return mapMateria;
	}

	public void setMapMateria(Set<Materia> mapMateria) {
		this.mapMateria = mapMateria;
	}
	
	@Override
	public String toString() {
		return "Clave: "+ getClaveLicenciatura()+" Nombre: "
				+ getNombreLicenciatura()+" Semestres: "+ getSemestres();
	}
	
	
	
	
}
