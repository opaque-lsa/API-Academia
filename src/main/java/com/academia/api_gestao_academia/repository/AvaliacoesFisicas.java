package com.academia.api_gestao_academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.api_gestao_academia.model.AvaliacaoFisica;

public interface AvaliacoesFisicas extends JpaRepository<AvaliacaoFisica, Long> {
    
}
