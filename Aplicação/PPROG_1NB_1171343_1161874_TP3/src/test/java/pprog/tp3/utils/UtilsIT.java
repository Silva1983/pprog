/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.utils;

import java.util.Date;
import java.util.List;
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
public class UtilsIT {
    
    public UtilsIT() {
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
     * Test of readLineFromConsole method, of class Utils.
     */
    @Test
    public void testReadLineFromConsole() {
        System.out.println("readLineFromConsole");
        String strPrompt = "";
        String expResult = "";
        String result = Utils.readLineFromConsole(strPrompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readIntegerFromConsole method, of class Utils.
     */
    @Test
    public void testReadIntegerFromConsole() {
        System.out.println("readIntegerFromConsole");
        String strPrompt = "";
        int expResult = 0;
        int result = Utils.readIntegerFromConsole(strPrompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDoubleFromConsole method, of class Utils.
     */
    @Test
    public void testReadDoubleFromConsole() {
        System.out.println("readDoubleFromConsole");
        String strPrompt = "";
        double expResult = 0.0;
        double result = Utils.readDoubleFromConsole(strPrompt);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDateFromConsole method, of class Utils.
     */
    @Test
    public void testReadDateFromConsole() {
        System.out.println("readDateFromConsole");
        String strPrompt = "";
        Date expResult = null;
        Date result = Utils.readDateFromConsole(strPrompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirma method, of class Utils.
     */
    @Test
    public void testConfirma() {
        System.out.println("confirma");
        String sMessage = "";
        boolean expResult = false;
        boolean result = Utils.confirma(sMessage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apresentaESeleciona method, of class Utils.
     */
    @Test
    public void testApresentaESeleciona() {
        System.out.println("apresentaESeleciona");
        List list = null;
        String sHeader = "";
        Object expResult = null;
        Object result = Utils.apresentaESeleciona(list, sHeader);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apresentaESelecionaIndex method, of class Utils.
     */
    @Test
    public void testApresentaESelecionaIndex() {
        System.out.println("apresentaESelecionaIndex");
        List list = null;
        String sHeader = "";
        int expResult = 0;
        int result = Utils.apresentaESelecionaIndex(list, sHeader);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apresentaLista method, of class Utils.
     */
    @Test
    public void testApresentaLista() {
        System.out.println("apresentaLista");
        List list = null;
        String sHeader = "";
        Utils.apresentaLista(list, sHeader);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selecionaObject method, of class Utils.
     */
    @Test
    public void testSelecionaObject() {
        System.out.println("selecionaObject");
        List list = null;
        Object expResult = null;
        Object result = Utils.selecionaObject(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selecionaIndex method, of class Utils.
     */
    @Test
    public void testSelecionaIndex() {
        System.out.println("selecionaIndex");
        List list = null;
        int expResult = 0;
        int result = Utils.selecionaIndex(list);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
