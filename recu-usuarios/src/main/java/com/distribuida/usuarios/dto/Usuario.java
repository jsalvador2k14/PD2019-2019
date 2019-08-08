package com.distribuida.usuarios.dto;

import lombok.Getter;
import lombok.Setter;

public class Usuario {

	@Getter @Setter private Integer id;
	@Getter @Setter private String name;
	@Getter @Setter private String username;
	@Getter @Setter private String email;	
}
