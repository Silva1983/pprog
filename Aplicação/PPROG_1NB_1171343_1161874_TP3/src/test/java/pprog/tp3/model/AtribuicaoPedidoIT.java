/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.model;

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
public class AtribuicaoPedidoIT {
    
    public AtribuicaoPedidoIT() {
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
     * Test of criterioDistancia method, of class AtribuicaoPedido.
     */
    @Test
    public void testCriterioDistancia() {
        System.out.println("criterioDistancia");
        AtribuicaoPedido instance = new AtribuicaoPedido();
        double expResult = 0.0;
        double result = instance.criterioDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criterioDisponibilidade method, of class AtribuicaoPedido.
     */
    @Test
    public void testCriterioDisponibilidade() {
        System.out.println("criterioDisponibilidade");
        AtribuicaoPedido instance = new AtribuicaoPedido();
        boolean expResult = false;
        boolean result = instance.criterioDisponibilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registaAtribuicao method, of class AtribuicaoPedido.
     */
    @Test
    public void testRegistaAtribuicao() {
        System.out.println("registaAtribuicao");
        AtribuicaoPedido instance = new AtribuicaoPedido();
        instance.registaAtribuicao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtribuicaoString method, of class AtribuicaoPedido.
     */
    @Test
    public void testGetAtribuicaoString() {
        System.out.println("getAtribuicaoString");
        AtribuicaoPedido instance = new AtribuicaoPedido();
        String expResult = "";
        String result = instance.getAtribuicaoString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
