package com.softplan.apigerenciarprocessos.modules.usuarios.entities;

import org.springframework.security.core.userdetails.UserDetails;

public class AuthenticationResponse {
  
  private final String jwt;
  private UserDetails usuario;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse(String jwt, UserDetails usuario) {
      this.jwt = jwt;
      this.usuario = usuario;
  }

    public String getJwt() {
        return jwt;
    }

    public UserDetails getUsuario() {
      return usuario;
    }

}
