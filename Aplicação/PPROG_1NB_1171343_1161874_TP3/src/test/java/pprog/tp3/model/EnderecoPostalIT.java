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
public class EnderecoPostalIT {
    
    public EnderecoPostalIT() {
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
     * Test of getM_strLocal method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_strLocal() {
        System.out.println("getM_strLocal");
        EnderecoPostal instance = new EnderecoPostal();
        String expResult = "";
        String result = instance.getM_strLocal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strLocal method, of class EnderecoPostal.
     */
    @Test
    public void testSetM_strLocal() {
        System.out.println("setM_strLocal");
        String m_strLocal = "";
        EnderecoPostal instance = new EnderecoPostal();
        instance.setM_strLocal(m_strLocal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strCodPostal method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_strCodPostal() {
        System.out.println("getM_strCodPostal");
        EnderecoPostal instance = new EnderecoPostal();
        String expResult = "";
        String result = instance.getM_strCodPostal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strCodPostal method, of class EnderecoPostal.
     */
    @Test
    public void testSetM_strCodPostal() {
        System.out.println("setM_strCodPostal");
        String m_strCodPostal = "";
        EnderecoPostal instance = new EnderecoPostal();
        instance.setM_strCodPostal(m_strCodPostal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strLocalidade method, of class EnderecoPostal.
     */
    @Test
    public void testGetM_strLocalidade() {
        System.out.println("getM_strLocalidade");
        EnderecoPostal instance = new EnderecoPostal();
        String expResult = "";
        String result = instance.getM_strLocalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strLocalidade method, of class EnderecoPostal.
     */
    @Test
    public void testSetM_strLocalidade() {
        System.out.println("setM_strLocalidade");
        String m_strLocalidade = "";
        EnderecoPostal instance = new EnderecoPostal();
        instance.setM_strLocalidade(m_strLocalidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class EnderecoPostal.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        EnderecoPostal instance = new EnderecoPostal();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class EnderecoPostal.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        EnderecoPostal instance = new EnderecoPostal();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EnderecoPostal.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EnderecoPostal instance = new EnderecoPostal();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
