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
public class Desempregado extends Contribuinte {

    private int mesesParagem;
    private static float taxaOR = .02f;

    private static final int PARAGEM_POR_OMISSAO = 0;

    public Desempregado() {
        super();
        this.mesesParagem = PARAGEM_POR_OMISSAO;
    }

    public Desempregado(String nome, String morada, float outrosRendimentos, int mesesParagem) {
        super(nome, morada, outrosRendimentos);
        this.mesesParagem = mesesParagem;

    }

    public int getMesesParagem() {
        return mesesParagem;
    }

    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    public float getTaxaRT() {
        return taxaOR;
    }

    public static void setTaxa(float novaTaxa) {
        taxaOR = novaTaxa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public float calcularImposto() {
        return super.getOutrosRendimentos() * taxaOR;
    }
}
