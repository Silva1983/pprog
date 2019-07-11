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
import pprog.tp3.biblioteca.Data;
import pprog.tp3.biblioteca.Tempo;

/**
 *
 * @author ssilv
 */
public class DisponibilidadeIT {
    
    public DisponibilidadeIT() {
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
     * Test of getDataInicio method, of class Disponibilidade.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        Disponibilidade instance = new Disponibilidade();
        Data expResult = null;
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataInicio method, of class Disponibilidade.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        Data dataInicio = null;
        Disponibilidade instance = new Disponibilidade();
        instance.setDataInicio(dataInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFim method, of class Disponibilidade.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        Disponibilidade instance = new Disponibilidade();
        Data expResult = null;
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFim method, of class Disponibilidade.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        Data dataFim = null;
        Disponibilidade instance = new Disponibilidade();
        instance.setDataFim(dataFim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraInicio method, of class Disponibilidade.
     */
    @Test
    public void testGetHoraInicio() {
        System.out.println("getHoraInicio");
        Disponibilidade instance = new Disponibilidade();
        Tempo expResult = null;
        Tempo result = instance.getHoraInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraInicio method, of class Disponibilidade.
     */
    @Test
    public void testSetHoraInicio() {
        System.out.println("setHoraInicio");
        Tempo horaInicio = null;
        Disponibilidade instance = new Disponibilidade();
        instance.setHoraInicio(horaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHoraFim method, of class Disponibilidade.
     */
    @Test
    public void testGetHoraFim() {
        System.out.println("getHoraFim");
        Disponibilidade instance = new Disponibilidade();
        Tempo expResult = null;
        Tempo result = instance.getHoraFim();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoraFim method, of class Disponibilidade.
     */
    @Test
    public void testSetHoraFim() {
        System.out.println("setHoraFim");
        Tempo horaFim = null;
        Disponibilidade instance = new Disponibilidade();
        instance.setHoraFim(horaFim);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Disponibilidade.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Disponibilidade instance = new Disponibilidade();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
