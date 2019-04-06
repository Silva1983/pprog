/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl4;

/**
 *
 * @author ASUS
 */
public class Utente {

    private String nome;
    private String genero;
    private int idade;
    private float altura;
    private float peso;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String GENERO_POR_OMISSAO = "sem genero";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final int ALTURA_POR_OMISSAO = 0;
    private static final int PESO_POR_OMISSAO = 0;

    public Utente() {
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
    }
    
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        genero = GENERO_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
    }
    
    public Utente(String nome, String genero, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setIdade(float altura) {
        this.altura = altura;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s/nGénero: %s/nIdade: %d,/nAltura: %f/nPeso: %f Kg", 
                nome, genero, idade, altura, peso);
    }
    
    public int diferencaIdade(Utente outroUtente) {
        int resultado = Math.abs(getIdade() - outroUtente.getIdade());
        return resultado;
    }
    
    
}
