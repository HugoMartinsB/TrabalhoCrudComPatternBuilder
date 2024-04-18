package com.finan.orcamento.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

public class Casa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="num_quarto")
    private BigDecimal quartos;

    @NotNull
    @Column(name="num_banheiros")
        private BigDecimal banheiros;

    @NotNull
    @Column(name="churrasqueira")
    private boolean churrasqueira;

    public Casa(){};

    public Casa(int quartos, int banheiros, boolean churrasqueira) {
        this.quartos = BigDecimal.valueOf(quartos);
        this.banheiros = BigDecimal.valueOf(banheiros);
        this.churrasqueira = churrasqueira;

    }
}

