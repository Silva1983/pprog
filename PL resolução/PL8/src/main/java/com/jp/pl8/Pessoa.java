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
public class Pessoa {

    private String nome;

    private static final String NOME_POR_OMISSAO = "sem nome";

    public Pessoa() {
        nome = NOME_POR_OMISSAO;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
}
