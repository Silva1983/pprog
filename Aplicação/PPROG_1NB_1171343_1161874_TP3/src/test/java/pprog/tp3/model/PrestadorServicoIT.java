/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.model;

import java.util.ArrayList;
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
public class PrestadorServicoIT {
    
    public PrestadorServicoIT() {
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
     * Test of getServicos method, of class PrestadorServico.
     */
    @Test
    public void testGetServicos() {
        System.out.println("getServicos");
        PrestadorServico instance = new PrestadorServico();
        ArrayList<Servico> expResult = null;
        ArrayList<Servico> result = instance.getServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicos method, of class PrestadorServico.
     */
    @Test
    public void testSetServicos() {
        System.out.println("setServicos");
        List<Servico> novaListaServicos = null;
        PrestadorServico instance = new PrestadorServico();
        instance.setServicos(novaListaServicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreasGeograficas method, of class PrestadorServico.
     */
    @Test
    public void testGetAreasGeograficas() {
        System.out.println("getAreasGeograficas");
        PrestadorServico instance = new PrestadorServico();
        ArrayList<AreaGeografica> expResult = null;
        ArrayList<AreaGeografica> result = instance.getAreasGeograficas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAreasGeograficas method, of class PrestadorServico.
     */
    @Test
    public void testSetAreasGeograficas() {
        System.out.println("setAreasGeograficas");
        List<AreaGeografica> novaListaAreasGeograficas = null;
        PrestadorServico instance = new PrestadorServico();
        instance.setAreasGeograficas(novaListaAreasGeograficas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDisponibilidades method, of class PrestadorServico.
     */
    @Test
    public void testGetDisponibilidades() {
        System.out.println("getDisponibilidades");
        PrestadorServico instance = new PrestadorServico();
        ArrayList<Disponibilidade> expResult = null;
        ArrayList<Disponibilidade> result = instance.getDisponibilidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisponibilidades method, of class PrestadorServico.
     */
    @Test
    public void testSetDisponibilidades() {
        System.out.println("setDisponibilidades");
        List<Disponibilidade> novaListaDisponibilidades = null;
        PrestadorServico instance = new PrestadorServico();
        instance.setDisponibilidades(novaListaDisponibilidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDisponibilidades method, of class PrestadorServico.
     */
    @Test
    public void testAddDisponibilidades() {
        System.out.println("addDisponibilidades");
        Disponibilidade novaDisponibilidade = null;
        PrestadorServico instance = new PrestadorServico();
        instance.addDisponibilidades(novaDisponibilidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PrestadorServico.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Utilizador o = null;
        PrestadorServico instance = new PrestadorServico();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PrestadorServico.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PrestadorServico instance = new PrestadorServico();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PrestadorServico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PrestadorServico instance = new PrestadorServico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
