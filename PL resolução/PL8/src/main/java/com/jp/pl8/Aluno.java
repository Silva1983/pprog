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
public class Aluno extends Pessoa {
    
    private int numero;

    private static final int NUMERO_POR_OMISSAO = 0;

    public Aluno() {
        super();
        numero = NUMERO_POR_OMISSAO;
    }

    public Aluno(String nome, int numero) {
        super(nome);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Nome Aluno: %s%n" + "Nº: %d%n", super.toString(), numero);
    }
    
}
