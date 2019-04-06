/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl8;

/**
 *
 * @author ASUS
 */
public class AlunoBolseiro extends Aluno implements Vencimento {
    
    private float valorBolsa;

    private static final int BOLSA_POR_OMISSAO = 0;

    public AlunoBolseiro() {
        super();
        valorBolsa = BOLSA_POR_OMISSAO;
    }

    public AlunoBolseiro(String nome, int numero, float valorBolsa) {
        super(nome, numero);
        this.valorBolsa = valorBolsa;
    }

//    @Override
//    public String toString() {
//        return String.format("Nome Aluno: %s%n" + "Nº: %d%n", super.toString());
//    }
    
    @Override
    public double calcularVencimento() {
        return valorBolsa;
    }
}
