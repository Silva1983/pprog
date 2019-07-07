/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ssilv
 */
public class Apartamento extends Imovel implements Condominio{
    
    private int nmQuartos;
    private static float comissao = 0.04f;
    public float valCondominio = 0.50f;
    
    private static int contApartamento = 0;
    
    private final static int NMQUARTOS_POR_OMISSAO = 0;
    
    public Apartamento(){
        super();
        this.nmQuartos = NMQUARTOS_POR_OMISSAO;
        contApartamento++;
    }
    
    public Apartamento(String morada, String localidade, float areaUtil, float preco,  List<Imovel>imoveis, int nmQuartos){
        super(morada, localidade, areaUtil, preco, imoveis);
        this.nmQuartos = nmQuartos;
        contApartamento++;
    }

    public int getNmQuartos() {
        return nmQuartos;
    }

    public void setNmQuartos(int nmQuartos) {
        this.nmQuartos = nmQuartos;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(float comissao) {
        Apartamento.comissao = comissao;
    }
    
    public static int getContApartamento(){
        return contApartamento;
    }

    public void setValCondominio(float valCondominio) {
        this.valCondominio = valCondominio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Apartamento other = (Apartamento) obj;
        if (this.nmQuartos != other.nmQuartos) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public double valorImovel(){
        return preco + comissao;
    }
    
    @Override
    public float calcularCondominio(){
        return valCondominio * this.areaUtil;
    }
}
