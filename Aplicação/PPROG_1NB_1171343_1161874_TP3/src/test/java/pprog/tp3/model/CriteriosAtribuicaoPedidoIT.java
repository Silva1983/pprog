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
public class CriteriosAtribuicaoPedidoIT {
    
    public CriteriosAtribuicaoPedidoIT() {
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
     * Test of criterioDistancia method, of class CriteriosAtribuicaoPedido.
     */
    @Test
    public void testCriterioDistancia() {
        System.out.println("criterioDistancia");
        CriteriosAtribuicaoPedido instance = new CriteriosAtribuicaoPedidoImpl();
        double expResult = 0.0;
        double result = instance.criterioDistancia();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criterioDisponibilidade method, of class CriteriosAtribuicaoPedido.
     */
    @Test
    public void testCriterioDisponibilidade() {
        System.out.println("criterioDisponibilidade");
        CriteriosAtribuicaoPedido instance = new CriteriosAtribuicaoPedidoImpl();
        boolean expResult = false;
        boolean result = instance.criterioDisponibilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CriteriosAtribuicaoPedidoImpl implements CriteriosAtribuicaoPedido {

        public double criterioDistancia() {
            return 0.0;
        }

        public boolean criterioDisponibilidade() {
            return false;
        }
    }
    
}
