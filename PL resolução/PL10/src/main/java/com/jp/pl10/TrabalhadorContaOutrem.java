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
public class TrabalhadorContaOutrem extends ContribuinteRendimentosTrabalho {

    private String empresa;

    private static final String EMPRESA_POR_OMISSAO = "sem empresa";

    private static float taxaRT1 = .01f;
    private static float taxaRT2 = .02f;
    private static float taxaOR = .02f;

    public TrabalhadorContaOutrem() {
        super();
        empresa = EMPRESA_POR_OMISSAO;
    }

    public TrabalhadorContaOutrem(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos, String empresa) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public static void setTaxaRT1(float novaTaxa) {
        taxaRT1 = novaTaxa;
    }

    public static void setTaxaRT2(float novaTaxa) {
        taxaRT2 = novaTaxa;
    }

    public static void setTaxaOR(float novaTaxa) {
        taxaOR = novaTaxa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float calcularImposto() {
        return super.getRendimentosTrabalho() * (super.getRendimentosTrabalho() <= 30000 ? taxaRT1 : taxaRT2)
                + super.getOutrosRendimentos() * taxaOR;
    }
}
