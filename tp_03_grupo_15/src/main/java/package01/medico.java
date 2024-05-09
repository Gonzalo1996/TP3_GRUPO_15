package package01;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="medicos")	
public class medico {
	
	
	@Id
	@Column(name="legajo")
	private int legajo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="nac")
	private String nac;
	
	
	
	public int getLegajo() {
		return legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getGenero() {
		return genero;
	}
	public String getNac() {
		return nac;
	}
	
	
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setNac(String nac) {
		this.nac = nac;
	}
	
	
	public medico(int legajo, String nombre, String apellido, String genero, String nac) {
		//super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.nac = nac;
	}
	
	
	public medico() {
		
	}
	
	
	
	@Override
	public String toString() {
		String cadena = "Legajo Medico : " + this.getLegajo() + " - Nombre : " + this.getNombre() + " - Apellido : " +
	this.getApellido() + " - Genero : " + this.getGenero() + " - Fecha Nacimiento : " + this.getNac() + ";";
		return cadena;
	}
	
	
	
	
	
	
		
	
	

}
