/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.ui.console;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pprog.tp3.model.Empresa;

/**
 *
 * @author ssilv
 */
public class PedidoPrestacaoServicoUIIT {
    
    public PedidoPrestacaoServicoUIIT() {
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
     * Test of run method, of class PedidoPrestacaoServicoUI.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Empresa empresa = null;
        int indexUtilizador = 0;
        PedidoPrestacaoServicoUI instance = new PedidoPrestacaoServicoUI();
        instance.run(empresa, indexUtilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
