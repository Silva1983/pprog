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
public class CategoriaIT {
    
    public CategoriaIT() {
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
     * Test of hasId method, of class Categoria.
     */
    @Test
    public void testHasId() {
        System.out.println("hasId");
        String strId = "";
        Categoria instance = new Categoria();
        boolean expResult = false;
        boolean result = instance.hasId(strId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Categoria.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Categoria.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String m_strCodigo = "";
        Categoria instance = new Categoria();
        instance.setCodigo(m_strCodigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Categoria.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Categoria.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String m_strDescricao = "";
        Categoria instance = new Categoria();
        instance.setDescricao(m_strDescricao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Categoria.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Categoria instance = new Categoria();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Categoria instance = new Categoria();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
