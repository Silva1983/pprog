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
public class ServicoIT {
    
    public ServicoIT() {
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
     * Test of hasId method, of class Servico.
     */
    @Test
    public void testHasId() {
        System.out.println("hasId");
        String strId = "";
        Servico instance = new Servico();
        boolean expResult = false;
        boolean result = instance.hasId(strId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strId method, of class Servico.
     */
    @Test
    public void testGetM_strId() {
        System.out.println("getM_strId");
        Servico instance = new Servico();
        String expResult = "";
        String result = instance.getM_strId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strId method, of class Servico.
     */
    @Test
    public void testSetM_strId() {
        System.out.println("setM_strId");
        String m_strId = "";
        Servico instance = new Servico();
        instance.setM_strId(m_strId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strDescricaoBreve method, of class Servico.
     */
    @Test
    public void testGetM_strDescricaoBreve() {
        System.out.println("getM_strDescricaoBreve");
        Servico instance = new Servico();
        String expResult = "";
        String result = instance.getM_strDescricaoBreve();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strDescricaoBreve method, of class Servico.
     */
    @Test
    public void testSetM_strDescricaoBreve() {
        System.out.println("setM_strDescricaoBreve");
        String m_strDescricaoBreve = "";
        Servico instance = new Servico();
        instance.setM_strDescricaoBreve(m_strDescricaoBreve);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_strDescricaoCompleta method, of class Servico.
     */
    @Test
    public void testGetM_strDescricaoCompleta() {
        System.out.println("getM_strDescricaoCompleta");
        Servico instance = new Servico();
        String expResult = "";
        String result = instance.getM_strDescricaoCompleta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_strDescricaoCompleta method, of class Servico.
     */
    @Test
    public void testSetM_strDescricaoCompleta() {
        System.out.println("setM_strDescricaoCompleta");
        String m_strDescricaoCompleta = "";
        Servico instance = new Servico();
        instance.setM_strDescricaoCompleta(m_strDescricaoCompleta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_dCustoHora method, of class Servico.
     */
    @Test
    public void testGetM_dCustoHora() {
        System.out.println("getM_dCustoHora");
        Servico instance = new Servico();
        double expResult = 0.0;
        double result = instance.getM_dCustoHora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_dCustoHora method, of class Servico.
     */
    @Test
    public void testSetM_dCustoHora() {
        System.out.println("setM_dCustoHora");
        double m_dCustoHora = 0.0;
        Servico instance = new Servico();
        instance.setM_dCustoHora(m_dCustoHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getM_oCategoria method, of class Servico.
     */
    @Test
    public void testGetM_oCategoria() {
        System.out.println("getM_oCategoria");
        Servico instance = new Servico();
        Categoria expResult = null;
        Categoria result = instance.getM_oCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setM_oCategoria method, of class Servico.
     */
    @Test
    public void testSetM_oCategoria() {
        System.out.println("setM_oCategoria");
        Categoria m_oCategoria = null;
        Servico instance = new Servico();
        instance.setM_oCategoria(m_oCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Servico.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Servico instance = new Servico();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Servico.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Servico instance = new Servico();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Servico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Servico instance = new Servico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
