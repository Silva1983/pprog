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
public class PedidoPrestacaoServicoIT {
    
    public PedidoPrestacaoServicoIT() {
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
     * Test of getCliente method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPreferencia method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetDataPreferencia() {
        System.out.println("getDataPreferencia");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        Data expResult = null;
        Data result = instance.getDataPreferencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataPreferencia method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetDataPreferencia() {
        System.out.println("setDataPreferencia");
        Data dataPreferencia = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setDataPreferencia(dataPreferencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempoPreferencia method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetTempoPreferencia() {
        System.out.println("getTempoPreferencia");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        Tempo expResult = null;
        Tempo result = instance.getTempoPreferencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempoPreferencia method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetTempoPreferencia() {
        System.out.println("setTempoPreferencia");
        Tempo tempoPreferencia = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setTempoPreferencia(tempoPreferencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracao method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetDuracao() {
        System.out.println("getDuracao");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        Tempo expResult = null;
        Tempo result = instance.getDuracao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracao method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testSetDuracao() {
        System.out.println("setDuracao");
        Tempo duracao = null;
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        instance.setDuracao(duracao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroPedido method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testGetNumeroPedido() {
        System.out.println("getNumeroPedido");
        int expResult = 0;
        int result = PedidoPrestacaoServico.getNumeroPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PedidoPrestacaoServico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PedidoPrestacaoServico instance = new PedidoPrestacaoServico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
