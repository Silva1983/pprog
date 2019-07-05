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
public class moradia extends imovel{
    
    private int nmQuartos;
    private double areaExterior;
    
    public static double comissaoMin = 0.05;
    public static double comissaoMax = 0.06;
    
    private final static int NMQUARTOS_POR_OMISSAO = 0;
    private final static int AREA_EXTERIOR_POR_OMISSAO = 0;
    
    public moradia(){
        super();
        this.nmQuartos = NMQUARTOS_POR_OMISSAO;
        this.areaExterior = AREA_EXTERIOR_POR_OMISSAO;
    }
    
    public moradia(String morada, String localidade, float areaUtil, float preco, int nmQuartos, double areaExterior){
        super(morada, localidade, areaUtil, preco);
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
        moradia.comissaoMin = comissaoMin;
    }

    public static double getComissaoMax() {
        return comissaoMax;
    }

    public static void setComissaoMax(double comissaoMax) {
        moradia.comissaoMax = comissaoMax;
    }

    @Override
    public double valorImovel(){
        return (getPreco() < 150000) ? preco + comissaoMin : preco + comissaoMax;

    }
}
