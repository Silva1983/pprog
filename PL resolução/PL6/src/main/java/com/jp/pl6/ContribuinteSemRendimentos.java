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
public abstract class ContribuinteSemRendimentos extends Contribuinte {

    private int mesesParagem;
    
    private static final int PARAGEM_POR_OMISSAO = 0;

    public ContribuinteSemRendimentos() {
        super();
        mesesParagem = PARAGEM_POR_OMISSAO;
    }

    public ContribuinteSemRendimentos(String nome, String morada, float outrosRendimentos, int mesesParagem) {
        super(nome, morada, outrosRendimentos, mesesParagem);
        this.mesesParagem = mesesParagem;
    }

    public void setMesesParagem(int mesesParagem) {
        this.mesesParagem = mesesParagem;
    }

    public int getMesesParagem() {
        return mesesParagem;
    }

    
    @Override
    public String toString() {
        return String.format("Nome: %s%nMorada: %s%nMeses paragem: %d", getNome(), getMorada(), mesesParagem);
    }
    @Override
    public abstract float calcularImposto();
    
}
