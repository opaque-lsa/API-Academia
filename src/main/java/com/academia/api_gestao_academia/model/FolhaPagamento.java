package com.academia.api_gestao_academia.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FolhaPagamento {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate competencia;
    private float salarioBase;
    private float adicionais;
    private float descontos;
    private LocalDate dataPagamento;
    private String status;
    
    public FolhaPagamento() {}

    public LocalDate getCompetencia() {
        return competencia;
    }
    public void setCompetencia(LocalDate competencia) {
        this.competencia = competencia;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public float getAdicionais() {
        return adicionais;
    }
    public void setAdicionais(float adicionais) {
        this.adicionais = adicionais;
    }
    public float getDescontos() {
        return descontos;
    }
    public void setDescontos(float descontos) {
        this.descontos = descontos;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
