/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp3.ui.console;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pprog.tp3.model.Utilizador;

/**
 *
 * @author ssilv
 */
public class IndicarDisponibilidadeUIIT {
    
    public IndicarDisponibilidadeUIIT() {
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
     * Test of run method, of class IndicarDisponibilidadeUI.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        List<Utilizador> utilizadores = null;
        int indexUtilizador = 0;
        IndicarDisponibilidadeUI instance = new IndicarDisponibilidadeUI();
        instance.run(utilizadores, indexUtilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
