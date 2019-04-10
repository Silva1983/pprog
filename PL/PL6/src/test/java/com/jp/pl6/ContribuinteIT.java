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
public class ContribuinteIT {
    
    public ContribuinteIT() {
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
     * Test of getNome method, of class Contribuinte.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Contribuinte instance = new ContribuinteImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class Contribuinte.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Contribuinte instance = new ContribuinteImpl();
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRendimentosTrabalho method, of class Contribuinte.
     */
    @Test
    public void testGetRendimentosTrabalho() {
        System.out.println("getRendimentosTrabalho");
        Contribuinte instance = new ContribuinteImpl();
        float expResult = 0.0F;
        float result = instance.getRendimentosTrabalho();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutrosRendimentos method, of class Contribuinte.
     */
    @Test
    public void testGetOutrosRendimentos() {
        System.out.println("getOutrosRendimentos");
        Contribuinte instance = new ContribuinteImpl();
        float expResult = 0.0F;
        float result = instance.getOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Contribuinte.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Contribuinte instance = new ContribuinteImpl();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class Contribuinte.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        Contribuinte instance = new ContribuinteImpl();
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRendimentosTrabalho method, of class Contribuinte.
     */
    @Test
    public void testSetRendimentosTrabalho() {
        System.out.println("setRendimentosTrabalho");
        float rendimentosTrabalho = 0.0F;
        Contribuinte instance = new ContribuinteImpl();
        instance.setRendimentosTrabalho(rendimentosTrabalho);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutrosRendimentos method, of class Contribuinte.
     */
    @Test
    public void testSetOutrosRendimentos() {
        System.out.println("setOutrosRendimentos");
        float outrosRendimentos = 0.0F;
        Contribuinte instance = new ContribuinteImpl();
        instance.setOutrosRendimentos(outrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Contribuinte.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Contribuinte instance = new ContribuinteImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class Contribuinte.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        Contribuinte instance = new ContribuinteImpl();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContribuinteImpl extends Contribuinte {

        public float calcularImposto() {
            return 0.0F;
        }
    }
    
}
