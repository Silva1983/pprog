/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.biblioteca;

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
public class TempoIT {
    
    public TempoIT() {
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
     * Test of getHoras method, of class Tempo.
     */
    @Test
    public void testGetHoras() {
        System.out.println("getHoras");
        Tempo instance = new Tempo();
        int expResult = 0;
        int result = instance.getHoras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutos method, of class Tempo.
     */
    @Test
    public void testGetMinutos() {
        System.out.println("getMinutos");
        Tempo instance = new Tempo();
        int expResult = 0;
        int result = instance.getMinutos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegundos method, of class Tempo.
     */
    @Test
    public void testGetSegundos() {
        System.out.println("getSegundos");
        Tempo instance = new Tempo();
        int expResult = 0;
        int result = instance.getSegundos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoras method, of class Tempo.
     */
    @Test
    public void testSetHoras() {
        System.out.println("setHoras");
        int horas = 0;
        Tempo instance = new Tempo();
        instance.setHoras(horas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutos method, of class Tempo.
     */
    @Test
    public void testSetMinutos() {
        System.out.println("setMinutos");
        int minutos = 0;
        Tempo instance = new Tempo();
        instance.setMinutos(minutos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSegundos method, of class Tempo.
     */
    @Test
    public void testSetSegundos() {
        System.out.println("setSegundos");
        int segundos = 0;
        Tempo instance = new Tempo();
        instance.setSegundos(segundos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempo method, of class Tempo.
     */
    @Test
    public void testSetTempo() {
        System.out.println("setTempo");
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        Tempo instance = new Tempo();
        instance.setTempo(horas, minutos, segundos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Tempo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tempo instance = new Tempo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringHHMMSS method, of class Tempo.
     */
    @Test
    public void testToStringHHMMSS() {
        System.out.println("toStringHHMMSS");
        Tempo instance = new Tempo();
        String expResult = "";
        String result = instance.toStringHHMMSS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringHHMM method, of class Tempo.
     */
    @Test
    public void testToStringHHMM() {
        System.out.println("toStringHHMM");
        Tempo instance = new Tempo();
        String expResult = "";
        String result = instance.toStringHHMM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Tempo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = null;
        Tempo instance = new Tempo();
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Tempo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Tempo outroTempo = null;
        Tempo instance = new Tempo();
        int expResult = 0;
        int result = instance.compareTo(outroTempo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tick method, of class Tempo.
     */
    @Test
    public void testTick() {
        System.out.println("tick");
        Tempo instance = new Tempo();
        instance.tick();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMaior method, of class Tempo.
     */
    @Test
    public void testIsMaior_Tempo() {
        System.out.println("isMaior");
        Tempo outroTempo = null;
        Tempo instance = new Tempo();
        boolean expResult = false;
        boolean result = instance.isMaior(outroTempo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMaior method, of class Tempo.
     */
    @Test
    public void testIsMaior_3args() {
        System.out.println("isMaior");
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        Tempo instance = new Tempo();
        boolean expResult = false;
        boolean result = instance.isMaior(horas, minutos, segundos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferencaEmSegundos method, of class Tempo.
     */
    @Test
    public void testDiferencaEmSegundos() {
        System.out.println("diferencaEmSegundos");
        Tempo outroTempo = null;
        Tempo instance = new Tempo();
        int expResult = 0;
        int result = instance.diferencaEmSegundos(outroTempo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diferencaEmTempo method, of class Tempo.
     */
    @Test
    public void testDiferencaEmTempo() {
        System.out.println("diferencaEmTempo");
        Tempo outroTempo = null;
        Tempo instance = new Tempo();
        Tempo expResult = null;
        Tempo result = instance.diferencaEmTempo(outroTempo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tempoAtual method, of class Tempo.
     */
    @Test
    public void testTempoAtual() {
        System.out.println("tempoAtual");
        Tempo expResult = null;
        Tempo result = Tempo.tempoAtual();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
