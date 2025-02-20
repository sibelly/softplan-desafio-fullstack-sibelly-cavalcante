package com.softplan.apigerenciarprocessos.modules.usuarios.services;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.repositories.UsuariosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CriarUsuarioService {
  
  @Autowired
  private UsuariosRepository usuariosRepository;

  public CriarUsuarioService(UsuariosRepository usuariosRepository) {
      this.usuariosRepository = usuariosRepository;
  }

  public Usuario criarUsuario(Usuario usuario) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    String hashedSenha = passwordEncoder.encode(usuario.getSenha());
    usuario.setSenha(hashedSenha);
    System.out.println("********************** CriarUsuarioService " + usuario.getEmail() + " " + usuario.getNome() + " " + usuario.getFuncao() + " " + usuario.getSenha());
    return usuariosRepository.save(usuario);
  }
}
