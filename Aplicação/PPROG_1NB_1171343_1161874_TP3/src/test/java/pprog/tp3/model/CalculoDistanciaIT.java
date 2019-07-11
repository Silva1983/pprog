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
public class CalculoDistanciaIT {
    
    public CalculoDistanciaIT() {
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
     * Test of distancia method, of class CalculoDistancia.
     */
    @Test
    public void testDistancia() {
        System.out.println("distancia");
        double lat1 = 0.0;
        double lon1 = 0.0;
        double lat2 = 0.0;
        double lon2 = 0.0;
        CalculoDistancia instance = new CalculoDistancia();
        double expResult = 0.0;
        double result = instance.distancia(lat1, lon1, lat2, lon2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
