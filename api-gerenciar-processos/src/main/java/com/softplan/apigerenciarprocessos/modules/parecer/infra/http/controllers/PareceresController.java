package com.softplan.apigerenciarprocessos.modules.parecer.infra.http.controllers;

import java.util.List;

import com.softplan.apigerenciarprocessos.modules.parecer.entities.Parecer;
import com.softplan.apigerenciarprocessos.modules.parecer.services.CriarParecerService;
import com.softplan.apigerenciarprocessos.modules.parecer.services.ListarPareceresService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pareceres")
public class PareceresController {
  @Autowired
  private ListarPareceresService listarPareceresService;

  @Autowired
  private CriarParecerService criarParecerService;

  public PareceresController(ListarPareceresService listarPareceresService, CriarParecerService criarParecerService) {
    this.listarPareceresService = listarPareceresService;
    this.criarParecerService = criarParecerService;
  }

  @GetMapping()
  public List<Parecer> listar() {
      return listarPareceresService.listar();
  }

  @PostMapping()
  public Parecer post(@RequestBody Parecer parecer) {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@" + parecer.getDescricao());
      return criarParecerService.criarParecer(parecer);
  }
}
