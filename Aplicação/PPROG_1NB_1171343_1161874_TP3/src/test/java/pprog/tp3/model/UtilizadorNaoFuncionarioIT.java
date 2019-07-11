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
public class UtilizadorNaoFuncionarioIT {
    
    public UtilizadorNaoFuncionarioIT() {
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
     * Test of getNif method, of class UtilizadorNaoFuncionario.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        UtilizadorNaoFuncionario instance = new UtilizadorNaoFuncionarioImpl();
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNif method, of class UtilizadorNaoFuncionario.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        UtilizadorNaoFuncionario instance = new UtilizadorNaoFuncionarioImpl();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone method, of class UtilizadorNaoFuncionario.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        UtilizadorNaoFuncionario instance = new UtilizadorNaoFuncionarioImpl();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone method, of class UtilizadorNaoFuncionario.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        UtilizadorNaoFuncionario instance = new UtilizadorNaoFuncionarioImpl();
        instance.setTelefone(telefone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UtilizadorNaoFuncionario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UtilizadorNaoFuncionario instance = new UtilizadorNaoFuncionarioImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UtilizadorNaoFuncionarioImpl extends UtilizadorNaoFuncionario {
    }
    
}
