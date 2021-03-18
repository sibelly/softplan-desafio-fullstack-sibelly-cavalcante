package com.softplan.apigerenciarprocessos.modules.usuarios.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.enums.Funcao;

@Entity(name = "usuarios")
public class Usuario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String email;
  private String senha;

  @Enumerated(EnumType.STRING)
  private Funcao funcao = Funcao.ADMIN;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

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

  public Funcao getFuncao() {
    return funcao;
  }

  public void setFuncao(Funcao funcao) {
    this.funcao = funcao;
  }
}