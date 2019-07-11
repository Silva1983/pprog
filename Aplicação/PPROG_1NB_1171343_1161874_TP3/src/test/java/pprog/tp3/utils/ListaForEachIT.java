/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.utils;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pprog.tp3.model.Disponibilidade;
import pprog.tp3.model.PedidoPrestacaoServico;
import pprog.tp3.model.Utilizador;

/**
 *
 * @author ssilv
 */
public class ListaForEachIT {
    
    public ListaForEachIT() {
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
     * Test of listarPedidos method, of class ListaForEach.
     */
    @Test
    public void testListarPedidos() {
        System.out.println("listarPedidos");
        List<PedidoPrestacaoServico> lista = null;
        ListaForEach.listarPedidos(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarUtilizadores method, of class ListaForEach.
     */
    @Test
    public void testListarUtilizadores() {
        System.out.println("listarUtilizadores");
        List<Utilizador> lista = null;
        ListaForEach.listarUtilizadores(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarDisponibilidades method, of class ListaForEach.
     */
    @Test
    public void testListarDisponibilidades() {
        System.out.println("listarDisponibilidades");
        List<Disponibilidade> lista = null;
        ListaForEach.listarDisponibilidades(lista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
