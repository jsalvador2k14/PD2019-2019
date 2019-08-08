package com.distribuida.web.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.jsf.FacesContextUtils;

import com.distribuida.web.dto.Post;
import com.distribuida.web.dto.Usuario;

import lombok.Getter;

@SessionScoped @ManagedBean(value="postAction")
public class PostAction {
	
	private String GATEWAY;
	
	private RestTemplate restTemplate;
	
	@Getter private List<Post> posts;
	
	@PostConstruct
	protected void inicializar( ) {
		ApplicationContext springCtx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		
		Environment env = springCtx.getBean( Environment.class );
		
		GATEWAY = env.getProperty( "gateway.url" );
		
		restTemplate = new RestTemplate( );
		
		posts = new ArrayList<>();
	}
	
	public String listar( ) {
		
		Post[] datos = restTemplate.getForObject( GATEWAY + "/posts", Post[].class );
		
		posts = Stream.of( datos )
			.collect( Collectors.toList() );
		
		// listar los usuarios
		
		Usuario[] usuarios = restTemplate.getForObject( GATEWAY + "/usuarios", Usuario[].class );
		Map<Integer, Usuario> cache = new HashMap<>( );

		Stream.of( usuarios )
			.forEach( s->{
				cache.put( s.getId(), s );
			});
		
		posts = posts.stream()
			.map( s->{
				Usuario user = cache.get( s.getId() );
				
				if( user!=null ) {				
					s.setUsername( user.getUsername() );
				}
				else {
					s.setUsername( "---" );
				}
				return s;
			})
			.collect( Collectors.toList() );
		
		return "";
	}

}
