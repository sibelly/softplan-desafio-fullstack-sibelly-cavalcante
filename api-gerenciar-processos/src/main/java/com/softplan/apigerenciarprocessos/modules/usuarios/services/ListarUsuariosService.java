package com.softplan.apigerenciarprocessos.modules.usuarios.services;

import java.util.List;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListarUsuariosService {

  @Autowired
  private UsuariosRepository usuariosRepository;

  public List<Usuario> getAll() {
    return (List<Usuario>) usuariosRepository.findAll();
  }
}
