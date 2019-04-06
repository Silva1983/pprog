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
public class Reformado extends ContribuinteRendimentosTrabalho {

    private static float taxaRT = .01f;
    private static float taxaOR = .03f;

    public Reformado() {
        super();
    }

    public Reformado(String nome, String morada, float rendimentosTrabalho, float outrosRendimentos) {
        super(nome, morada, rendimentosTrabalho, outrosRendimentos);
    }

    public static void setTaxaRT(float novaTaxa) {
        taxaRT = novaTaxa;
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
        return (super.getRendimentosTrabalho() * taxaRT + super.getOutrosRendimentos() * taxaOR);
    }
}
