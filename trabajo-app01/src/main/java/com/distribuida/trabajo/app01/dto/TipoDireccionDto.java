package com.distribuida.trabajo.app01.dto;

import java.io.Serializable;
import java.util.Map;

public class TipoDireccionDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
    private String descripcion;
    
    public static TipoDireccionDto fromMap( Map<String, Object> obj ) {
    	TipoDireccionDto p = new TipoDireccionDto( );
    	
    	p.setId( (Integer )obj.get("id") );
    	p.setDescripcion( (String )obj.get("descripcion") );
		
		return p;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
