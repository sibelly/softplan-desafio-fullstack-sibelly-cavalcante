package com.softplan.apigerenciarprocessos.modules.parecer.services;

import java.util.List;

import com.softplan.apigerenciarprocessos.modules.parecer.entities.Parecer;
import com.softplan.apigerenciarprocessos.modules.parecer.repositories.PareceresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListarPareceresService {
  
  @Autowired
  private PareceresRepository pareceresRepository;

  public ListarPareceresService(PareceresRepository pareceresRepository) {
    this.pareceresRepository = pareceresRepository;
  }

  public List<Parecer> listar() {
    return (List<Parecer>) pareceresRepository.findAll();
}

}
