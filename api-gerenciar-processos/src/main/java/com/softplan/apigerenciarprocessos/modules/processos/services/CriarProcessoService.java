package com.softplan.apigerenciarprocessos.modules.processos.services;

import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;
import com.softplan.apigerenciarprocessos.modules.processos.repositories.ProcessosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarProcessoService {

  @Autowired
  private ProcessosRepository processosRepository;

  public CriarProcessoService(ProcessosRepository processosRepository) {
    this.processosRepository = processosRepository;
  }

  public Processo criarProcesso(Processo processo) {
      return processosRepository.save(processo);
  }

}
