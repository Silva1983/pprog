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
public class EmpresaIT {
    
    public EmpresaIT() {
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
     * Test of getDesignacao method, of class Empresa.
     */
    @Test
    public void testGetDesignacao() {
        System.out.println("getDesignacao");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getDesignacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesignacao method, of class Empresa.
     */
    @Test
    public void testSetDesignacao() {
        System.out.println("setDesignacao");
        String designacao = "";
        Empresa instance = new Empresa();
        instance.setDesignacao(designacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNif method, of class Empresa.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNif method, of class Empresa.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        Empresa instance = new Empresa();
        instance.setNif(nif);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizadores method, of class Empresa.
     */
    @Test
    public void testGetUtilizadores() {
        System.out.println("getUtilizadores");
        Empresa instance = new Empresa();
        List<Utilizador> expResult = null;
        List<Utilizador> result = instance.getUtilizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUtilizadores method, of class Empresa.
     */
    @Test
    public void testSetUtilizadores() {
        System.out.println("setUtilizadores");
        List<Utilizador> utilizadores = null;
        Empresa instance = new Empresa();
        instance.setUtilizadores(utilizadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategorias method, of class Empresa.
     */
    @Test
    public void testGetCategorias() {
        System.out.println("getCategorias");
        Empresa instance = new Empresa();
        ArrayList<Categoria> expResult = null;
        ArrayList<Categoria> result = instance.getCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategorias method, of class Empresa.
     */
    @Test
    public void testSetCategorias() {
        System.out.println("setCategorias");
        List<Categoria> novaListaCategorias = null;
        Empresa instance = new Empresa();
        instance.setCategorias(novaListaCategorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicos method, of class Empresa.
     */
    @Test
    public void testGetServicos() {
        System.out.println("getServicos");
        Empresa instance = new Empresa();
        ArrayList<Servico> expResult = null;
        ArrayList<Servico> result = instance.getServicos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicos method, of class Empresa.
     */
    @Test
    public void testSetServicos() {
        System.out.println("setServicos");
        List<Servico> novaListaServicos = null;
        Empresa instance = new Empresa();
        instance.setServicos(novaListaServicos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedidosPrestacaoServico method, of class Empresa.
     */
    @Test
    public void testGetPedidosPrestacaoServico() {
        System.out.println("getPedidosPrestacaoServico");
        Empresa instance = new Empresa();
        List<PedidoPrestacaoServico> expResult = null;
        List<PedidoPrestacaoServico> result = instance.getPedidosPrestacaoServico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedidosPrestacaoServico method, of class Empresa.
     */
    @Test
    public void testSetPedidosPrestacaoServico() {
        System.out.println("setPedidosPrestacaoServico");
        List<PedidoPrestacaoServico> pedidosPrestacaoServico = null;
        Empresa instance = new Empresa();
        instance.setPedidosPrestacaoServico(pedidosPrestacaoServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Empresa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Empresa instance = new Empresa();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUtilizador method, of class Empresa.
     */
    @Test
    public void testAddUtilizador() {
        System.out.println("addUtilizador");
        Utilizador novoUtilizador = null;
        Empresa instance = new Empresa();
        instance.addUtilizador(novoUtilizador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addServico method, of class Empresa.
     */
    @Test
    public void testAddServico() {
        System.out.println("addServico");
        Servico novoServico = null;
        Empresa instance = new Empresa();
        instance.addServico(novoServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPedidoPrestacaoServico method, of class Empresa.
     */
    @Test
    public void testAddPedidoPrestacaoServico() {
        System.out.println("addPedidoPrestacaoServico");
        PedidoPrestacaoServico pedidoPrestacaoServico = null;
        Empresa instance = new Empresa();
        instance.addPedidoPrestacaoServico(pedidoPrestacaoServico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUtilizadorByEmail method, of class Empresa.
     */
    @Test
    public void testCheckUtilizadorByEmail() {
        System.out.println("checkUtilizadorByEmail");
        String email = "";
        Empresa instance = new Empresa();
        boolean expResult = false;
        boolean result = instance.checkUtilizadorByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUtilizadorByEmail method, of class Empresa.
     */
    @Test
    public void testGetUtilizadorByEmail() {
        System.out.println("getUtilizadorByEmail");
        String email = "";
        Empresa instance = new Empresa();
        int expResult = 0;
        int result = instance.getUtilizadorByEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
