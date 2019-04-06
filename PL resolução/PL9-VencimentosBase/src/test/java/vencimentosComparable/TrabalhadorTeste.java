/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vencimentosComparable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author ASUS
 */
public class TrabalhadorTeste {
    
    public TrabalhadorTeste() {
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
     * Test of getNome method, of class Trabalhador.
     */
    @Ignore
    public void testGetNome() {
        System.out.println("getNome");
        Trabalhador instance = new TrabalhadorImpl();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Trabalhador.
     */
    @Ignore
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Trabalhador instance = new TrabalhadorImpl();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVencimento method, of class Trabalhador.
     */
    @Test
    public void testCalcularVencimento() {
        System.out.println("calcularVencimento");
        
        TrabalhadorComissao instance = new TrabalhadorComissao(null, 500.0f, 1500.0f, 6f);
        float expResult = 590.0f;
        
        float result = instance.calcularVencimento();
        
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareTo method, of class Trabalhador.
     */
    @Ignore
    public void testCompareTo() {
        System.out.println("compareTo");
        Trabalhador outroTrabalhador = null;
        Trabalhador instance = new TrabalhadorImpl();
        int expResult = 0;
        int result = instance.compareTo(outroTrabalhador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TrabalhadorImpl extends Trabalhador {

        public float calcularVencimento() {
            return 0.0F;
        }
    }
    
}
