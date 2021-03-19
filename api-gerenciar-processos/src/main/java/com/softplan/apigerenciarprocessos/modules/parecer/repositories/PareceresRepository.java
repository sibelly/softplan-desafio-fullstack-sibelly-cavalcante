package com.softplan.apigerenciarprocessos.modules.parecer.repositories;

import java.util.Optional;

import com.softplan.apigerenciarprocessos.modules.parecer.entities.Parecer;
import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;

import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PareceresRepository extends CrudRepository<Parecer, Long> {
  Optional<Parecer> findByProcesso(@Param("processo") Processo processo);
}
