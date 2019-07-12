/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examerecurso2019;

import java.util.ArrayList;
/**
 *
 * @author ssilv
 */
public class TestExamePPROG {
    public static void main(String[] args) {
        
        ArrayList<Software> programas = new ArrayList<>();
        
        Software s1 = new SoftwareAberto();
        
        programas.add(new SoftwareAberto());
        programas.add(new SoftwareComercialExperimental());
        programas.add(new SoftwareComercialIntegral());
        programas.add(new SoftwareAberto());
        
        s1.setProgramas(programas);
        
       
    }
}
