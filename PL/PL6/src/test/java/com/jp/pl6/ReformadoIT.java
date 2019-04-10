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
public class ReformadoIT {
    
    public ReformadoIT() {
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
     * Test of getTaxaRT method, of class Reformado.
     */
    @Test
    public void testGetTaxaRT() {
        System.out.println("getTaxaRT");
        Reformado instance = new Reformado();
        float expResult = 0.0F;
        float result = instance.getTaxaRT();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOR method, of class Reformado.
     */
    @Test
    public void testGetTaxaOR() {
        System.out.println("getTaxaOR");
        Reformado instance = new Reformado();
        float expResult = 0.0F;
        float result = instance.getTaxaOR();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRT method, of class Reformado.
     */
    @Test
    public void testSetTaxaRT() {
        System.out.println("setTaxaRT");
        float taxaRT = 0.0F;
        Reformado instance = new Reformado();
        instance.setTaxaRT(taxaRT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOR method, of class Reformado.
     */
    @Test
    public void testSetTaxaOR() {
        System.out.println("setTaxaOR");
        float taxaOR = 0.0F;
        Reformado instance = new Reformado();
        instance.setTaxaOR(taxaOR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Reformado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reformado instance = new Reformado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class Reformado.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        Reformado instance = new Reformado();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
