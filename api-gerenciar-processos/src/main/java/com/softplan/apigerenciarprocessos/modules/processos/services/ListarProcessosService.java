package com.softplan.apigerenciarprocessos.modules.processos.services;

import java.util.List;
import java.util.Optional;

import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;
import com.softplan.apigerenciarprocessos.modules.processos.repositories.ProcessosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListarProcessosService {
  @Autowired
  private ProcessosRepository processosRepository;
  
  public ListarProcessosService(ProcessosRepository processosRepository) {
    this.processosRepository = processosRepository;
  }

  public List<Processo> listar() {
      return (List<Processo>) processosRepository.findAll();
  }

  public Optional<Processo> getOne(Long processoId) {
      return processosRepository.findById(processoId);
  }

}
