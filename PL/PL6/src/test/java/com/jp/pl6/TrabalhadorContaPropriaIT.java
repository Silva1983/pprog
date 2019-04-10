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
public class TrabalhadorContaPropriaIT {
    
    public TrabalhadorContaPropriaIT() {
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
     * Test of getEmpresa method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        String expResult = "";
        String result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        String profissao = "";
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        instance.setEmpresa(profissao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRT method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testGetTaxaRT() {
        System.out.println("getTaxaRT");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.getTaxaRT();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOR1 method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testGetTaxaOR1() {
        System.out.println("getTaxaOR1");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.getTaxaOR1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOR2 method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testGetTaxaOR2() {
        System.out.println("getTaxaOR2");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.getTaxaOR2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaRT method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testSetTaxaRT() {
        System.out.println("setTaxaRT");
        float taxaRT = 0.0F;
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        instance.setTaxaRT(taxaRT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOR1 method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testSetTaxaOR1() {
        System.out.println("setTaxaOR1");
        float taxaOR1 = 0.0F;
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        instance.setTaxaOR1(taxaOR1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaxaOR2 method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testSetTaxaOR2() {
        System.out.println("setTaxaOR2");
        float taxaOR2 = 0.0F;
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        instance.setTaxaOR2(taxaOR2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class TrabalhadorContaPropria.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        TrabalhadorContaPropria instance = new TrabalhadorContaPropria();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
