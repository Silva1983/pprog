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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author ssilv
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({pprog.tp3.ui.console.AutenticacaoUIIT.class, pprog.tp3.ui.console.MenuPrestadorServicoUIIT.class, pprog.tp3.ui.console.PedidoPrestacaoServicoUIIT.class, pprog.tp3.ui.console.MenuUIIT.class, pprog.tp3.ui.console.IndicarDisponibilidadeUIIT.class, pprog.tp3.ui.console.MenuAdministrativoUIIT.class, pprog.tp3.ui.console.MenuClienteUIIT.class, pprog.tp3.ui.console.AtribuirPedidoUIIT.class})
public class ConsoleITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
