package com.softplan.apigerenciarprocessos.modules.usuarios.infra.http.controllers;

import javax.servlet.http.HttpServletResponse;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.AuthenticationService;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.CriarUsuarioService;
import com.softplan.apigerenciarprocessos.shared.infra.responses.ResourceNotFoundException;
import com.softplan.apigerenciarprocessos.shared.infra.responses.WrongCredentialsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessoes")
public class SessoesController {
  @Autowired
  private AuthenticationService authenticationService;

  @Autowired
  private CriarUsuarioService criarUsuarioService;

  @PostMapping()
  public Usuario login(HttpServletResponse response, @RequestBody Usuario usuario) throws ResourceNotFoundException,
  WrongCredentialsException {

    if (usuario.getSenha() == null || usuario.getSenha().isEmpty() || usuario.getEmail() == null ||
          usuario.getEmail().isEmpty()) {
      throw new WrongCredentialsException("E-mail and password are required fields!");
    }

    authenticationService.loadUserByUsername(usuario.getEmail());

    if (!usuario.getSenha().equals(usuario.getSenha())) {
      throw new WrongCredentialsException("Wrong password!");
    }

    response.addHeader("Authorization", "token");

    return usuario;
  }

  @PostMapping("/registrar")
  public Usuario post(@RequestBody Usuario usuario) {
      return criarUsuarioService.criarUsuario(usuario);
  }

}
