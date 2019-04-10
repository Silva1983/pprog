/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ssilv
 */
public class DesempregadoIT {
    
    public DesempregadoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTaxaRT method, of class Desempregado.
     */
    @Test
    public void testGetTaxaRT() {
        System.out.println("getTaxaRT");
        Desempregado instance = new Desempregado();
        float expResult = 0.0F;
        float result = instance.getTaxaRT();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxa method, of class Desempregado.
     */
    @Test
    public void testSetTaxa() {
        System.out.println("setTaxa");
        float novaTaxa = 0.0F;
        Desempregado.setTaxa(novaTaxa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Desempregado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Desempregado instance = new Desempregado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class Desempregado.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        Desempregado instance = new Desempregado();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
