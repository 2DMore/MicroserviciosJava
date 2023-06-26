package mx.uady.microservicios.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	
	//Relacion Usuario n:m Materias
	@ManyToMany(mappedBy = "mapMateria", fetch = FetchType.EAGER)
    private Set<Usuario> mapUsuario= new HashSet<Usuario>();

	//Relacion Materia n:m Licenciatura ****preguntar porque se realiza la accion delete :(
	@ManyToMany(mappedBy="mapMateria", cascade= CascadeType.PERSIST, fetch = FetchType.EAGER)
	private Set<Licenciatura> mapLicenciatura=new HashSet<>();
	
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
	
	public Set<Usuario> getMapUsuario() {
		return mapUsuario;
	}

	public void setMapUsuario(Set<Usuario> mapUsuario) {
		this.mapUsuario = mapUsuario;
	}

	public Set<Licenciatura> getMapLicenciatura() {
		return mapLicenciatura;
	}

	public void setMapLicenciatura(Set<Licenciatura> mapLicenciatura) {
		this.mapLicenciatura = mapLicenciatura;
	}

	@Override
	public String toString() {
		return "Clave: "+getClaveMateria() +" Nombre: "+ getNombreMateria() +" Semestre: "
	+ getSemestre()+" Licenciatura: " + getLicenciatura();
	}
	
}
