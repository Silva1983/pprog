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
public class Moradia extends Imovel{
    
    private int nmQuartos;
    private double areaExterior;
    
    public static double comissaoMin = 0.05;
    public static double comissaoMax = 0.06;
    
    private final static int NMQUARTOS_POR_OMISSAO = 0;
    private final static int AREA_EXTERIOR_POR_OMISSAO = 0;
    
    public Moradia(){
        super();
        this.nmQuartos = NMQUARTOS_POR_OMISSAO;
        this.areaExterior = AREA_EXTERIOR_POR_OMISSAO;
    }
    
    public Moradia(String morada, String localidade, float areaUtil, float preco, List<Imovel>imoveis, int nmQuartos, double areaExterior){
        super(morada, localidade, areaUtil, preco, imoveis);
        this.nmQuartos = nmQuartos;
        this.areaExterior = areaExterior;
    }

    public int getNmQuartos() {
        return nmQuartos;
    }

    public void setNmQuartos(int nmQuartos) {
        this.nmQuartos = nmQuartos;
    }

    public double getAreaExterior() {
        return areaExterior;
    }

    public void setAreaExterior(double areaExterior) {
        this.areaExterior = areaExterior;
    }

    public static double getComissaoMin() {
        return comissaoMin;
    }

    public static void setComissaoMin(double comissaoMin) {
        Moradia.comissaoMin = comissaoMin;
    }

    public static double getComissaoMax() {
        return comissaoMax;
    }

    public static void setComissaoMax(double comissaoMax) {
        Moradia.comissaoMax = comissaoMax;
    }

    @Override
    public double valorImovel(){
        return (getPreco() < 150000) ? preco + comissaoMin : preco + comissaoMax;

    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Moradia other = (Moradia) obj;
        
        return Imovel.class.equals(obj) && this.getNmQuartos() == other.getNmQuartos() && 
                this.getAreaExterior() == other.getAreaExterior();
                
    }
    
    
    
}
