package com.softplan.apigerenciarprocessos.modules.processos.infra.http.controllers;

import java.util.List;

import com.softplan.apigerenciarprocessos.modules.processos.entities.Processo;
import com.softplan.apigerenciarprocessos.modules.processos.services.CriarProcessoService;
import com.softplan.apigerenciarprocessos.modules.processos.services.ListarProcessosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/processos")
public class ProcessosController {

  @Autowired
  private ListarProcessosService listarProcessosService;

  @Autowired
  private CriarProcessoService criarProcessoService;

  public ProcessosController(ListarProcessosService listarProcessosService, CriarProcessoService criarProcessoService) {
    this.listarProcessosService = listarProcessosService;
    this.criarProcessoService = criarProcessoService;
  }

  @GetMapping()
  public List<Processo> getAll() {
      return listarProcessosService.listar();
  }

  @PostMapping()
  public Processo post(@RequestBody Processo processo) {
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@" + processo.getDescricao());
      return criarProcessoService.criarProcesso(processo);
  }

}
