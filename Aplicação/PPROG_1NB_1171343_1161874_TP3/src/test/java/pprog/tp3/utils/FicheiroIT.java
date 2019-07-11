/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pprog.tp3.model.Cliente;

/**
 *
 * @author ssilv
 */
public class FicheiroIT {
    
    public FicheiroIT() {
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
     * Test of getInfoFicheiro method, of class Ficheiro.
     */
    @Test
    public void testGetInfoFicheiro() {
        System.out.println("getInfoFicheiro");
        String filePath = "";
        List<ArrayList<String>> expResult = null;
        List<ArrayList<String>> result = Ficheiro.getInfoFicheiro(filePath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravarObj method, of class Ficheiro.
     */
    @Test
    public void testGravarObj() {
        System.out.println("gravarObj");
        Cliente obj = null;
        File ficheiro = null;
        Ficheiro instance = new Ficheiro();
        boolean expResult = false;
        boolean result = instance.gravarObj(obj, ficheiro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerObj method, of class Ficheiro.
     */
    @Test
    public void testLerObj_0args() {
        System.out.println("lerObj");
        Ficheiro instance = new Ficheiro();
        Cliente expResult = null;
        Cliente result = instance.lerObj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerObj method, of class Ficheiro.
     */
    @Test
    public void testLerObj_String() {
        System.out.println("lerObj");
        String nomeFicheiro = "";
        Ficheiro instance = new Ficheiro();
        Cliente expResult = null;
        Cliente result = instance.lerObj(nomeFicheiro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lerObj method, of class Ficheiro.
     */
    @Test
    public void testLerObj_File() {
        System.out.println("lerObj");
        File ficheiro = null;
        Ficheiro instance = new Ficheiro();
        Cliente expResult = null;
        Cliente result = instance.lerObj(ficheiro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
