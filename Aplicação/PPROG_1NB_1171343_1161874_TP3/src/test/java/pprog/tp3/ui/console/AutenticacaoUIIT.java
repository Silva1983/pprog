/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.ui.console;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pprog.tp3.model.Empresa;

/**
 *
 * @author ssilv
 */
public class AutenticacaoUIIT {
    
    public AutenticacaoUIIT() {
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
     * Test of run method, of class AutenticacaoUI.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Empresa empresa = null;
        AutenticacaoUI instance = null;
        String expResult = "";
        String result = instance.run(empresa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpresa method, of class AutenticacaoUI.
     */
    @Test
    public void testGetEmpresa() {
        System.out.println("getEmpresa");
        AutenticacaoUI instance = null;
        Empresa expResult = null;
        Empresa result = instance.getEmpresa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpresa method, of class AutenticacaoUI.
     */
    @Test
    public void testSetEmpresa() {
        System.out.println("setEmpresa");
        Empresa empresa = null;
        AutenticacaoUI instance = null;
        instance.setEmpresa(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class AutenticacaoUI.
     */
    @Test
    public void testLogout() throws Exception {
        System.out.println("logout");
        Empresa empresa = null;
        AutenticacaoUI instance = null;
        instance.logout(empresa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
