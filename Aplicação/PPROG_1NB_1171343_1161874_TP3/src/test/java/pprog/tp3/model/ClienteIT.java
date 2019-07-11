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
public class ClienteIT {
    
    public ClienteIT() {
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
     * Test of getMorada method, of class Cliente.
     */
    @Test
    public void testGetMorada() {
        System.out.println("getMorada");
        Cliente instance = new Cliente();
        EnderecoPostal expResult = null;
        EnderecoPostal result = instance.getMorada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoradas method, of class Cliente.
     */
    @Test
    public void testSetMoradas() {
        System.out.println("setMoradas");
        EnderecoPostal morada = null;
        Cliente instance = new Cliente();
        instance.setMoradas(morada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Cliente.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novoEnderecoPostal method, of class Cliente.
     */
    @Test
    public void testNovoEnderecoPostal() {
        System.out.println("novoEnderecoPostal");
        String strLocal = "";
        String strCodPostal = "";
        String strLocalidade = "";
        EnderecoPostal expResult = null;
        EnderecoPostal result = Cliente.novoEnderecoPostal(strLocal, strCodPostal, strLocalidade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
