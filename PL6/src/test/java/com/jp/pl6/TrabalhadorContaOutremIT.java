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
public class TrabalhadorContaOutremIT {
    
    public TrabalhadorContaOutremIT() {
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
     * Test of getEmpresa method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String empresa = "";
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRT1 method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testGetTaxaRT1() {
        System.out.println("getTaxaRT1");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.getTaxaRT1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRT2 method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testGetTaxaRT2() {
        System.out.println("getTaxaRT2");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.getTaxaRT2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOR method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testGetTaxaOR() {
        System.out.println("getTaxaOR");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.getTaxaOR();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRT1 method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testSetTaxaRT1() {
        System.out.println("setTaxaRT1");
        float taxaRT1 = 0.0F;
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        instance.setTaxaRT1(taxaRT1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRT2 method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testSetTaxaRT2() {
        System.out.println("setTaxaRT2");
        float taxaRT2 = 0.0F;
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        instance.setTaxaRT2(taxaRT2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOR method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testSetTaxaOR() {
        System.out.println("setTaxaOR");
        float taxaOR = 0.0F;
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        instance.setTaxaOR(taxaOR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class TrabalhadorContaOutrem.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        TrabalhadorContaOutrem instance = new TrabalhadorContaOutrem();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
