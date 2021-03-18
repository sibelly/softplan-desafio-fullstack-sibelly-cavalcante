package com.softplan.apigerenciarprocessos.modules.usuarios.repositories;

import java.util.Optional;

import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuario, Long> {
  Optional<Usuario> findByEmail(@Param("email") String email);
}
