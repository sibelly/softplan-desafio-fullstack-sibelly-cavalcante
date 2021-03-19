package com.softplan.apigerenciarprocessos.modules.processos.repositories;

import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessosRepository extends CrudRepository<Processo, Long> {
}
