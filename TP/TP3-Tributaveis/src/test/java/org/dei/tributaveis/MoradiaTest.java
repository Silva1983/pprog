/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dei.tributaveis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore; // substituir import org.junit.Test para poder correr o Code Coverage (right-click no projeto);
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MoradiaTest {
    
    public MoradiaTest() {
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
     * Test of getMorada method, of class Moradia.
     */
    @org.junit.Ignore
    public void testGetMorada() {
        System.out.println("getMorada");
        Moradia instance = null;
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Moradia.
     */
    @org.junit.Ignore
    public void testGetArea() {
        System.out.println("getArea");
        Moradia instance = null;
        float expResult = 0.0F;
        float result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCor method, of class Moradia.
     */
    @org.junit.Ignore
    public void testGetCor() {
        System.out.println("getCor");
        Moradia instance = null;
        String expResult = "";
        String result = instance.getCor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class Moradia.
     */
    @org.junit.Ignore
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        Moradia instance = null;
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Moradia.
     */
    @org.junit.Ignore
    public void testSetArea() {
        System.out.println("setArea");
        float area = 0.0F;
        Moradia instance = null;
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCor method, of class Moradia.
     */
    @org.junit.Ignore
    public void testSetCor() {
        System.out.println("setCor");
        String cor = "";
        Moradia instance = null;
        instance.setCor(cor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Moradia.
     */
    @org.junit.Ignore
    public void testToString() {
        System.out.println("toString");
        
        Moradia instance = null;
        String expResult = "";
        
        String result = instance.toString();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class Moradia.
     */
    @org.junit.Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        // alterado (colocar apenas variáveis relevantes para o teste)
        Moradia instance = new Moradia(null, 90, null);
        double expResult = 180.0;
        
        double result = instance.calcularImposto();
        
        assertEquals(expResult, result, 0.0);
        
    }
    
}
