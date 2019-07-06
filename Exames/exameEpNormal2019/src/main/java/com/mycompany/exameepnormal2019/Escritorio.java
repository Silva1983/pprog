/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

import java.util.List;

/**
 *
 * @author ssilv
 */
public class Escritorio extends Imovel implements Condominio{
    private static float comissao = 0.07f;
    public float valCondominio = 0.40f;
    
    public Escritorio(){
        super();
    }
    
    public Escritorio(String morada, String localidade, float areaUtil, List<Imovel>imoveis, float preco){
        super(morada, localidade, areaUtil, preco, imoveis);
    }

    public void setValCondominio(float valCondominio) {
        this.valCondominio = valCondominio;
    }
    
    
    @Override
    public double valorImovel(){
        return preco + comissao;
    }
    
    @Override
    public float calcularCondominio(){
        return areaUtil * valCondominio;
    }
}
