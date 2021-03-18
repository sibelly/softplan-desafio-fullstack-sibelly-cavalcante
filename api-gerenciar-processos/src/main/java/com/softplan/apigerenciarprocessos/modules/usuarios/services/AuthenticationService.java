package com.softplan.apigerenciarprocessos.modules.usuarios.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {
  
	@Autowired
	private BuscarUsuarioPorEmailService buscarUsuarioPorEmail;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    List<GrantedAuthority> listGrantAuthority = new ArrayList<GrantedAuthority>();
		Optional<Usuario> usuario = buscarUsuarioPorEmail.buscarPorEmail(email);
		
		usuario.orElseThrow(() -> new UsernameNotFoundException("Not Found: " + email));

		this.checkGrantAuthorities(usuario.get(), listGrantAuthority);
		UserDetails userDetails = this.validateUser(email, listGrantAuthority, usuario);
  	return userDetails;
  }

	private void checkGrantAuthorities(Usuario usuario, List<GrantedAuthority> listGrantAuthority) {
		if(usuario != null && usuario.getFuncao() != null){
			final String PREFIX = "ROLE_";
			String role = PREFIX + usuario.getFuncao();
			listGrantAuthority.add(new SimpleGrantedAuthority(role));	
		}
	}

  private UserDetails validateUser(String email,List<GrantedAuthority> listGrantAuthority, Optional<Usuario> usuario) {
		UserDetails userDetails= null;
		if(usuario != null){
			boolean accountNonLocked=true;
			boolean enabledUser=true;
			boolean accountNonExpired=true;
			boolean credentialsNonExpired=true;
      userDetails = new  org.springframework.security.core.userdetails.User(email, usuario.get().getSenha(), enabledUser, accountNonExpired, credentialsNonExpired, accountNonLocked, listGrantAuthority);
		}	
		return userDetails;
	}
}
