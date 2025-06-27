package com.academia.api_gestao_academia.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pagamento {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDate data;
    private String forma;
    private float valor;

    public Pagamento() {}
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getForma() {
        return forma;
    }
    public void setForma(String forma) {
        this.forma = forma;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
}
