package com.softplan.apigerenciarprocessos.modules.usuarios.entities;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {

  private static final long serialVersionUID = 1L;
  private String email;
  private String senha;

  public String getEmail() {
      return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }

  public String getSenha() {
      return senha;
  }

  public void setSenha(String senha) {
      this.senha = senha;
  }

  //need default constructor for JSON Parsing
  public AuthenticationRequest(){}

  public AuthenticationRequest(String email, String senha) {
      this.setEmail(email);
      this.setSenha(senha);
  }
  
}
