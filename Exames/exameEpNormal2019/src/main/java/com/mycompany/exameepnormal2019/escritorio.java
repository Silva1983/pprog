/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

/**
 *
 * @author ssilv
 */
public class escritorio extends imovel implements calcularCondominio{
    private static float comissao = 0.07f;
    public float valCondominio = 0.40f;
    
    public escritorio(){
        super();
    }
    
    public escritorio(String morada, String localidade, float areaUtil, float preco){
        super(morada, localidade, areaUtil, preco);
    }

    public void setValCondominio(float valCondominio) {
        this.valCondominio = valCondominio;
    }
    
    
    @Override
    public double valorImovel(){
        return preco + comissao;
    }
    
    @Override
    public float condominio(){
        return areaUtil * valCondominio;
    }
}
