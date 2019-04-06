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
public class MainContador {
    
    public static void main(String[] args) {
        
        ContadorGas cg1 = new ContadorGas("Zé", 250);
        ContadorGas cg2 = new ContadorGas("Toni", 300);
        
        System.out.println(cg1);
        System.out.println(cg2);
        
    }
    
}
