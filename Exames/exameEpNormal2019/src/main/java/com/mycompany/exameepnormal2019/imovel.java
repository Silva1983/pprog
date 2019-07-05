/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

import java.util.Objects;

/**
 *
 * @author ssilv
 */
public abstract class  imovel {
    private String morada;
    private String localidade;
    public float areaUtil;
    public float preco;
    
    private final static String MORADA_POR_OMISSAO = "Sem morada";
    private final static String LOCALIDADE_POR_OMISSAO = "Sem localidade";
    private final static int AREA_UTIL_POR_OMISSAO = 0;
    private final static int PRECO_POR_OMISSAO = 0;
    
    public imovel(){
        this.morada = MORADA_POR_OMISSAO;
        this.localidade = LOCALIDADE_POR_OMISSAO;
        this.areaUtil = AREA_UTIL_POR_OMISSAO;
        this.preco = PRECO_POR_OMISSAO;
    }
    
    public imovel(String morada, String localidade, float areaUtil, float preco){
        this.morada = morada;
        this.localidade = localidade;
        this.areaUtil = areaUtil;
        this.preco = preco;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public float getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(float areaUtil) {
        this.areaUtil = areaUtil;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final imovel other = (imovel) obj;
        if (!Objects.equals(this.morada, other.morada)) {
            return false;
        }
        if (!Objects.equals(this.localidade, other.localidade)) {
            return false;
        }
        if (Float.floatToIntBits(this.areaUtil) != Float.floatToIntBits(other.areaUtil)) {
            return false;
        }
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return String.format("Morada: %s%nLocalidade: %s%nÁrea útil: %s%nPreço: %s", this.morada, this.localidade, this.areaUtil, this.preco);
    }
    
    public abstract double valorImovel();
}
