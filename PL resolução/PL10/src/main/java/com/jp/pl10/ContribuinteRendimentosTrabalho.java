/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl10;

/**
 *
 * @author ASUS
 */
public abstract class ContribuinteRendimentosTrabalho extends Contribuinte {

    private String nome;
    private String morada;
    private float rendimentosTrabalho;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String MORADA_POR_OMISSAO = "sem morada";
    private static final float RT_POR_OMISSAO = 0;

    public ContribuinteRendimentosTrabalho() {
        super();
        rendimentosTrabalho = RT_POR_OMISSAO;

    }

    public ContribuinteRendimentosTrabalho(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, outrosRendimentos);
        this.rendimentosTrabalho = rendimentosTrabalho;

    }

    public float getRendimentosTrabalho() {
        return rendimentosTrabalho;
    }

    public void setRendimentosTrabalho(float rendimentosTrabalho) {
        this.rendimentosTrabalho = rendimentosTrabalho;
    }

    @Override
    public String toString() {
        return String.format("%s%nRT: %.2f", super.toString(), rendimentosTrabalho);
    }

}
