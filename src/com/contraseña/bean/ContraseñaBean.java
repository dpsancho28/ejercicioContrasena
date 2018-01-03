package com.contraseña.bean;

public class ContraseñaBean {
	
	/**
	 * @author scexe88
	 */
	
	/**
	 * Atributos
	 */
	private long longitud;
	private String contraseña;
	
	/**
	 * 
	 * Constructor
	 * 
	 * @param longitud
	 * @param contraseña
	 */
	public ContraseñaBean(long longitud, String contraseña) {
		super();
		this.longitud = longitud;
		this.contraseña = contraseña;
	}
	
	
	/**
	 *  Getters y Setters
	 */
	public long getLongitud() {
		return longitud;
	}
	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	/**
	 * toString
	 */
	public String toString() {
		return "ContraseñaBean [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
