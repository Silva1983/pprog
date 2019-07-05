/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author ssilv
 */
public abstract class  Imovel {
    private String morada;
    private String localidade;
    public float areaUtil;
    public float preco;
    
    private List<Imovel>imoveis;
    
    private final static String MORADA_POR_OMISSAO = "Sem morada";
    private final static String LOCALIDADE_POR_OMISSAO = "Sem localidade";
    private final static int AREA_UTIL_POR_OMISSAO = 0;
    private final static int PRECO_POR_OMISSAO = 0;
    
    public Imovel(){
        this.morada = MORADA_POR_OMISSAO;
        this.localidade = LOCALIDADE_POR_OMISSAO;
        this.areaUtil = AREA_UTIL_POR_OMISSAO;
        this.preco = PRECO_POR_OMISSAO;
        this.imoveis = new ArrayList<>();
    }
    
    public Imovel(String morada, String localidade, float areaUtil, float preco, List<Imovel>imoveis){
        this.morada = morada;
        this.localidade = localidade;
        this.areaUtil = areaUtil;
        this.preco = preco;
        this.imoveis = new ArrayList<>(imoveis);
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

    public ArrayList<Imovel> getImoveis() {
        return new ArrayList<>(imoveis);
    }

    public void setImoveis(ArrayList<Imovel> novaListaImoveis) {
        this.imoveis = new ArrayList<>(novaListaImoveis);
    }

    public void adicionarImovel(Imovel novoImovel){
        imoveis.add(novoImovel);
    }
    
    public List<Imovel> getImoveisByLocalAndArea(){
        List<Imovel>listaOrdenada = this.getImoveis();
        Collections.sort(listaOrdenada, new CompareImovelByLocalAndArea());
        return listaOrdenada;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imovel other = (Imovel) obj;
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
    
    class CompareImovelByLocalAndArea implements Comparator<Imovel>{
        @Override
        public int compare(Imovel i1, Imovel i2){
            //if (i1.getLocalidade().compareTo(i2.getLocalidade())
            if(i1.getAreaUtil() > i2.getAreaUtil()){
                return 1;
            }
            if(i1.getAreaUtil() < i2.getAreaUtil())
                    return -1;
            return 0;
        }
    }
    
}
