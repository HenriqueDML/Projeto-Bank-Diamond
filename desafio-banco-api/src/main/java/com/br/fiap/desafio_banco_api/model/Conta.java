package com.br.fiap.desafio_banco_api.model;

import java.time.LocalDate;

public class Conta {
    private Long id;
    private String numero;
    private String agencia;
    private String nomeTitular;
    private String cpfTitular;
    private LocalDate dataAbertura;
    private double saldoInicial;
    private boolean ativa;
    private TipoConta tipo;

    
    // Construtor padrão
    public Conta() {}

    // Construtor
    public Conta(Long id, String numero, String agencia, String nomeTitular, String cpfTitular, LocalDate dataAbertura,
            double saldoInicial, boolean ativa, TipoConta tipo) {
        this.id = id;
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.dataAbertura = dataAbertura;
        this.saldoInicial = saldoInicial;
        this.ativa = ativa;
        this.tipo = tipo;
    }
    
    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Conta{id=" + id + ", numero='" + numero + "', agencia='" + agencia + "', nomeTitular='" + nomeTitular + "', saldo=" + saldoInicial + ", ativa=" + ativa + ", tipo=" + tipo + "}";
    }
    
}
