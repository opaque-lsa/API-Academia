package com.academia.api_gestao_academia.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fatura {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float valorTotal;
    private LocalDate dataVencimento;
    private LocalDate dataEmissao;
    private String status;

    public Fatura() {}
    
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public LocalDate getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
