package com.softplan.apigerenciarprocessos.modules.usuarios.entities.enums;

public enum Funcao {
    ADMIN("ADMIN"), TRIADOR("TRIADOR"), FINALIZADOR("FINALIZADOR");

    private String nome;

    Funcao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
