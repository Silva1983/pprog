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
public class TrabalhadorContaPropria extends ContribuinteRendimentosTrabalho {
    
    private String profissao;

    private static final String PROFISSAO_POR_OMISSAO = "sem profissao";

    private static float taxaRT = .01f;
    private static float taxaOR1 = .02f;
    private static float taxaOR2 = .05f;

    public TrabalhadorContaPropria() {
        super();
        profissao = PROFISSAO_POR_OMISSAO;
    }

    public TrabalhadorContaPropria(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos, String profissao) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static void setTaxaRT(float novaTaxa) {
        taxaRT = novaTaxa;
    }

    public static void setTaxaOR1(float novaTaxa) {
        taxaOR1 = novaTaxa;
    }

    public static void setTaxaOR2(float novaTaxa) {
        taxaOR2 = novaTaxa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float calcularImposto() {
        return super.getRendimentosTrabalho() * taxaRT + (getOutrosRendimentos() <= 50000 ? taxaOR1 : taxaOR2);
    }
}
