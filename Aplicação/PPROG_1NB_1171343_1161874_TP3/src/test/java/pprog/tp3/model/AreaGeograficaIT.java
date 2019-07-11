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
public class AreaGeograficaIT {
    
    public AreaGeograficaIT() {
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
     * Test of getDesignacao method, of class AreaGeografica.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        AreaGeografica instance = new AreaGeografica();
        String expResult = "";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesignacao method, of class AreaGeografica.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "";
        AreaGeografica instance = new AreaGeografica();
        instance.setDesignacao(designacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustoDeslocacao method, of class AreaGeografica.
     */
    @Test
    public void testGetCustoDeslocacao() {
        System.out.println("getCustoDeslocacao");
        AreaGeografica instance = new AreaGeografica();
        float expResult = 0.0F;
        float result = instance.getCustoDeslocacao();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustoDeslocacao method, of class AreaGeografica.
     */
    @Test
    public void testSetCustoDeslocacao() {
        System.out.println("setCustoDeslocacao");
        float custoDeslocacao = 0.0F;
        AreaGeografica instance = new AreaGeografica();
        instance.setCustoDeslocacao(custoDeslocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoPostal method, of class AreaGeografica.
     */
    @Test
    public void testGetCodigoPostal() {
        System.out.println("getCodigoPostal");
        AreaGeografica instance = new AreaGeografica();
        String expResult = "";
        String result = instance.getCodigoPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoPostal method, of class AreaGeografica.
     */
    @Test
    public void testSetCodigoPostal() {
        System.out.println("setCodigoPostal");
        String codigoPostal = "";
        AreaGeografica instance = new AreaGeografica();
        instance.setCodigoPostal(codigoPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
