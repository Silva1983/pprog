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
public class ContadorGas extends Contador {

    private static float custoUnitario = .8f;
    private static int quantInst = 0;

    ContadorGas() {
        super();
    }

    ContadorGas(String nome, int consumo) {
        super(nome, consumo);
        setId(++quantInst);
    }

    public float getCustoUnitario() {
        return custoUnitario;
    }

    public static void setCustoUnitario(float novoCusto) {
        custoUnitario = novoCusto;
    }

    @Override
    public String toString() {
        return String.format("%sContador:%s%d", super.toString(), "GAS-", getId());
    }

    @Override
    public float calcularConsumo() {
        return custoUnitario * super.getConsumo();
    }
}
