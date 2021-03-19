package com.softplan.apigerenciarprocessos.modules.parecer.services;

import com.softplan.apigerenciarprocessos.modules.parecer.entities.Parecer;
import com.softplan.apigerenciarprocessos.modules.parecer.repositories.PareceresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CriarParecerService {
  
  @Autowired
  private PareceresRepository pareceresRepository;

  public CriarParecerService(PareceresRepository pareceresRepository) {
    this.pareceresRepository = pareceresRepository;
  }

  public Parecer criarParecer(Parecer parecer) {
      return pareceresRepository.save(parecer);
  }

}
