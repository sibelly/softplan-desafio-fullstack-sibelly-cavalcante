package com.softplan.apigerenciarprocessos.modules.usuarios.services;

import java.util.Optional;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarUsuarioPorEmailService {
  
  @Autowired
  private UsuariosRepository usuariosRepository;

  public BuscarUsuarioPorEmailService(UsuariosRepository usuariosRepository) {
    this.usuariosRepository = usuariosRepository;
}

  public Optional<Usuario> buscarPorEmail(String email) {
    return usuariosRepository.findByEmail(email);
  }

}
