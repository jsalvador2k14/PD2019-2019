package com.distribuida.trabajo.app01.dto;

import java.io.Serializable;
import java.util.Map;

public class PersonaDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private Integer id;
    private String cedula;
    private String direccion;
    private Integer tipoDireccion;
    private String nombre;
    
    // para obtener el nombre del tipo direccion
    private String tipoDireccionNombre;
    
    public static PersonaDto fromMap( Map<String, Object> obj ) {
		PersonaDto p = new PersonaDto( );
		
		p.setId( (Integer )obj.get("id") );
		p.setCedula( (String )obj.get("cedula"));
		p.setDireccion( (String )obj.get("direccion"));
		p.setTipoDireccion( (Integer )obj.get("tipo_direccion") );
		p.setNombre( (String )obj.get("nombre") );
		
		return p;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTipoDireccion() {
		return tipoDireccion;
	}

	public void setTipoDireccion(Integer tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDireccionNombre() {
		return tipoDireccionNombre;
	}

	public void setTipoDireccionNombre(String tipoDireccionNombre) {
		this.tipoDireccionNombre = tipoDireccionNombre;
	}

}
