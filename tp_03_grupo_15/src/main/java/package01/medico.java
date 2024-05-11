package package01;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="medicos")	
public class medico implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="legajo")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int legajo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="genero")
	private String genero;
	
	@Column(name="nac")
	private String nac;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="telefono")
	private String telefono;
	
	
	
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	public medico(String nombre, String apellido, String genero, String nac, String correo, String direccion, String localidad, String telefono) {
		//super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.nac = nac;
		this.direccion = direccion;
		this.localidad = localidad;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	
	public medico() {
		
	}
	@Override
	public String toString() {
		return "Legajo: " + legajo + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Género: " + genero
				+ ", Nacimiento: " + nac + ", Correo: " + correo + ", Direccion: " + direccion + ", Localidad: " + localidad
				+ ", Telefono: " + telefono;
	}
	
	
	
	
	
	
	
	
	
	
		
	
	

}
