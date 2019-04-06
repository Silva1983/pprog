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
public class Professor extends Pessoa {

    private String cc;
    private String categoria;
    private float vencimentoBase;
    private static float majoracaoAdjunto = .2f;
    private static float majoracaoCoordenador = .5f;

    private static final String CC_POR_OMISSAO = "sem nome";
    private static final String CATEGORIA_POR_OMISSAO = "sem categoria";
    private static final float VENCIMENTO_POR_OMISSAO = 0;

    public Professor() {
        super();
        categoria = CATEGORIA_POR_OMISSAO;
        cc = CC_POR_OMISSAO;
        vencimentoBase = VENCIMENTO_POR_OMISSAO;
    }

    public Professor(String nome, String cc, String categoria, float vencimentoBase) {
        super(nome);
        this.categoria = categoria;
        this.cc = cc;
        this.vencimentoBase = vencimentoBase;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String nome) {
        this.cc = nome;
    }

    public float getVencimentoBase() {
        return vencimentoBase;
    }

    public void setVencimentoBase(float vencimentoBase) {
        this.vencimentoBase = vencimentoBase;
    }

    @Override
    public String toString() {
        return String.format("Nome Professor: %s%n" + "Categoria: %s%n" + "Nº CC: %s%n" + 
                "Vencimento Base: %.2f €%n", super.toString(), categoria, cc, vencimentoBase);
    }
    
    public double calcularVencimento() {
        return vencimentoBase * (!categoria.equalsIgnoreCase("adjunto") ? 1 : 
                (categoria.equalsIgnoreCase("adjunto") ? majoracaoAdjunto : majoracaoCoordenador));
    }

}
