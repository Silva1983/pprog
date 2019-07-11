/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.model;

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
public class UtilizadorIT {
    
    public UtilizadorIT() {
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
     * Test of getNome method, of class Utilizador.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Utilizador.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Utilizador instance = new Utilizador();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Utilizador.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Utilizador.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Utilizador instance = new Utilizador();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Utilizador.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Utilizador instance = new Utilizador();
        Utilizador.Tipo expResult = null;
        Utilizador.Tipo result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Utilizador.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        Utilizador.Tipo tipo = null;
        Utilizador instance = new Utilizador();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasEmail method, of class Utilizador.
     */
    @Test
    public void testHasEmail() {
        System.out.println("hasEmail");
        String email = "";
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.hasEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPapeis method, of class Utilizador.
     */
    @Test
    public void testGetPapeis() {
        System.out.println("getPapeis");
        Utilizador instance = new Utilizador();
        List<Utilizador.Tipo> expResult = null;
        List<Utilizador.Tipo> result = instance.getPapeis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Utilizador.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Utilizador instance = new Utilizador();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Utilizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Utilizador instance = new Utilizador();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
