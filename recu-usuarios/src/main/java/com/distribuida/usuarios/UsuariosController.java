package com.distribuida.usuarios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.distribuida.usuarios.dto.Usuario;

@RestController
public class UsuariosController {
	
	@GetMapping(path = "/usuarios")
	public List<Usuario> listar( ) {
		Usuario u = new Usuario( );
		
		u.setId(1);
		u.setName( "nombre01" );
		u.setUsername( "username01" );
		
		List<Usuario> ret = new ArrayList<>();
		
		ret.add( u );
		
		return ret;
	}

}
