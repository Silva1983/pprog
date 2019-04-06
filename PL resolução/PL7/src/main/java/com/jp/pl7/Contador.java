/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl7;

/**
 *
 * @author ASUS
 */
public abstract class Contador {

    private String nome;
    private int consumo;
    private int id;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final int CONSUMO_POR_CONSUMO = 0;

    public Contador() {
        nome = NOME_POR_OMISSAO;
        consumo = CONSUMO_POR_CONSUMO;
    }

    public Contador(String nome, int consumo) {
        this.nome = nome;
        this.consumo = consumo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    public float getConsumo() {
        return consumo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s%nConsumo: %d%n", nome, consumo);
    }

    public abstract float calcularConsumo();

}
