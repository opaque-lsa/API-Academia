package com.academia.api_gestao_academia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Permissao {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    public Permissao() {}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
