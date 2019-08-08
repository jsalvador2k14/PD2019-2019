package com.distribuida.web.dto;

import lombok.Getter;
import lombok.Setter;

public class Post {

	@Getter @Setter private Integer id;
	@Getter @Setter private Integer userId;
	@Getter @Setter private String title;
	@Getter @Setter private String body;
	
	// nombre del usaurio
	@Getter @Setter private String username;
}
