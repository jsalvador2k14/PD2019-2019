package com.distribuida.trabajo.app01.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.trabajo.app01.ConfigProperties;
import com.distribuida.trabajo.app01.dto.PersonaDto;

@RequestScoped
@Path("/personas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonasRest {

	@Inject private ConfigProperties config;
	
	@PostConstruct
	protected void inicializar( ) {
	}
	
	@GET
	public List<PersonaDto> listar( ) {
		
		System.out.println( "*********" + config.getGatewayUrl() );
		
		PersonaDto u = new PersonaDto( );
		
		u.setId(1);
		u.setNombre( "nombre01" );
		u.setCedula( "cedula01" );
		
		List<PersonaDto> ret = new ArrayList<>();
		
		ret.add( u );
		
		return ret;
	}

}
