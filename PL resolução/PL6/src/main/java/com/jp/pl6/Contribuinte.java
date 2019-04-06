/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl6;

/**
 *
 * @author ASUS
 */
public abstract class Contribuinte {

    private String nome;
    private String morada;
    private float outrosRendimentos;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";
    private static final float OR_POR_OMISSAO = 0;

    public Contribuinte() {
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
        outrosRendimentos = OR_POR_OMISSAO;
    }

    public Contribuinte(String nome, String morada, float outrosRendimentos) {
        this.nome = nome;
        this.morada = morada;
        this.outrosRendimentos = outrosRendimentos;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public float getOutrosRendimentos() {
        return outrosRendimentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setOutrosRendimentos(float outrosRendimentos) {
        this.outrosRendimentos = outrosRendimentos;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s%nMorada: %s%nOR: %.2f", nome, morada, outrosRendimentos);
    }
    
    public abstract float calcularImposto();
    
}
