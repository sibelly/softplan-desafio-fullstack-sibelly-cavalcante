package com.softplan.apigerenciarprocessos.modules.usuarios.infra.http.controllers;

import java.util.List;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.CriarUsuarioService;
import com.softplan.apigerenciarprocessos.modules.usuarios.services.ListarUsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

  @Autowired
  private ListarUsuariosService listarUsuariosService;

  @Autowired
  private CriarUsuarioService criarUsuarioService;

  @GetMapping()
  public List<Usuario> listar() {
    return listarUsuariosService.getAll();
  }

  @PostMapping()
  public Usuario post(@RequestBody Usuario usuario) {
      return criarUsuarioService.criarUsuario(usuario);
  }
}