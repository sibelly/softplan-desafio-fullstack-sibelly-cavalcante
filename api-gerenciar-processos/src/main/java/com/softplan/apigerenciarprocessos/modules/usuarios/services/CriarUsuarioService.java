package com.softplan.apigerenciarprocessos.modules.usuarios.services;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarUsuarioService {
  
  @Autowired
  private UsuariosRepository usuariosRepository;

  public CriarUsuarioService(UsuariosRepository usuariosRepository) {
      this.usuariosRepository = usuariosRepository;
  }

  public Usuario criarUsuario(Usuario usuario) {
      return usuariosRepository.save(usuario);
  }
}
