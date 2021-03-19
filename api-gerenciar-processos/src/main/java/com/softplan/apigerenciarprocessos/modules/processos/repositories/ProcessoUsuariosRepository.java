package com.softplan.apigerenciarprocessos.modules.processos.repositories;

import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;
import com.softplan.apigerenciarprocessos.modules.processos.entities.ProcessoUsuario;
import com.softplan.apigerenciarprocessos.modules.usuarios.entities.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessoUsuariosRepository extends CrudRepository<ProcessoUsuario, Long> {
    Optional<ProcessoUsuario> findOneByUsuarioAndProcesso(@Param("usuario") Usuario usuario, @Param("processo") Processo processo);
}
