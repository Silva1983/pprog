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
public class ContribuinteSemRendimentosIT {
    
    public ContribuinteSemRendimentosIT() {
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
     * Test of getNome method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMorada method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        String expResult = "";
        String result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutrosRendimentos method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testGetOutrosRendimentos() {
        System.out.println("getOutrosRendimentos");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        float expResult = 0.0F;
        float result = instance.getOutrosRendimentos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMesesParagem method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testGetMesesParagem() {
        System.out.println("getMesesParagem");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        int expResult = 0;
        int result = instance.getMesesParagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMorada method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testSetMorada() {
        System.out.println("setMorada");
        String morada = "";
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        instance.setMorada(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOutrosRendimentos method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testSetOutrosRendimentos() {
        System.out.println("setOutrosRendimentos");
        float outrosRendimentos = 0.0F;
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        instance.setOutrosRendimentos(outrosRendimentos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMesesParagem method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testSetMesesParagem() {
        System.out.println("setMesesParagem");
        int mesesParagem = 0;
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        instance.setMesesParagem(mesesParagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularImposto method, of class ContribuinteSemRendimentos.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        ContribuinteSemRendimentos instance = new ContribuinteSemRendimentosImpl();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ContribuinteSemRendimentosImpl extends ContribuinteSemRendimentos {

        public float calcularImposto() {
            return 0.0F;
        }
    }
    
}
