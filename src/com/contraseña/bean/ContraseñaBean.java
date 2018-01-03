package com.contrase�a.bean;

public class Contrase�aBean {
	
	/**
	 * @author scexe88
	 */
	
	/**
	 * Atributos
	 */
	private long longitud;
	private String contrase�a;
	
	/**
	 * 
	 * Constructor
	 * 
	 * @param longitud
	 * @param contrase�a
	 */
	public Contrase�aBean(long longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
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
	public String getContrase�a() {
		return contrase�a;
	}
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	/**
	 * toString
	 */
	public String toString() {
		return "Contrase�aBean [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

}
