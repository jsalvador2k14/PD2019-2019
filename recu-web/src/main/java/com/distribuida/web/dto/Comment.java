package com.distribuida.web.dto;

import lombok.Getter;
import lombok.Setter;

public class Comment {

	@Getter @Setter private Integer id;
	@Getter @Setter private Integer postId;
	@Getter @Setter private String name;
	@Getter @Setter private String email;
	@Getter @Setter private String body;
}
