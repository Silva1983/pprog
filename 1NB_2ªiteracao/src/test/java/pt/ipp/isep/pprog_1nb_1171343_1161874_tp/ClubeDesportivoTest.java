/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pt.ipp.isep.biblioteca.Data;
import org.junit.Ignore;

/**
 *
 * @author ASUS
 */
public class ClubeDesportivoTest {
    
    public ClubeDesportivoTest() {
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
     * Test of getNome method, of class ClubeDesportivo.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        ClubeDesportivo instance = new ClubeDesportivo("FC Porto", new Data(), new ArrayList<>());
        String expResult = "FC Porto";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }
    /**
     * Test of setNome method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFundacao method, of class ClubeDesportivo.
     */
    @Ignore
    public void testGetDataFundacao() {
        System.out.println("getDataFundacao");
        ClubeDesportivo instance = new ClubeDesportivo();
        Data expResult = null;
        Data result = instance.getDataFundacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataFundacao method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetDataFundacao() {
        System.out.println("setDataFundacao");
        Data dataFundacao = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setDataFundacao(dataFundacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testGetAtletas() {
        System.out.println("getAtletas");
        ClubeDesportivo instance = new ClubeDesportivo();
        ArrayList<Atleta> expResult = null;
        ArrayList<Atleta> result = instance.getAtletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtletas method, of class ClubeDesportivo.
     */
    @Ignore
    public void testSetAtletas() {
        System.out.println("setAtletas");
        List<Atleta> novaListaAtletas = null;
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.setAtletas(novaListaAtletas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ClubeDesportivo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ClubeDesportivo instance = new ClubeDesportivo("FC Porto", Data.dataAtual(), new ArrayList<>());
        String expResult = String.format("%nNome do Clube: %s%n", "FC Porto");
        String result = instance.toString();
        assertEquals(expResult, result);        
    }

    /**
     * Test of adicionarAtleta method, of class ClubeDesportivo.
     */
    @Test
    public void testAdicionarAtleta() {
        System.out.println("adicionarAtleta");
        
        Atleta novoAtleta = new AtletaSemiProfissional("Ricardo Pereira", 826534521, "masculino", 35, "caminhada", 150, 100, 12);
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.adicionarAtleta(novoAtleta);
        String expResult = "Ricardo Pereira";        
        String result = instance.getAtletas().get(0).getNome();   
        assertEquals(expResult, result, "Ricardo Pereira");
    }

    /**
     * Test of sortAtletas method, of class ClubeDesportivo.
     */
    @Test
    public void testSortAtletas() {
        System.out.println("sortAtletas");
        ClubeDesportivo instance = new ClubeDesportivo();
        instance.adicionarAtleta(new AtletaSemiProfissional("Ricardo Pereira", 0, null, 0, null, 0, 0, 0));
        instance.adicionarAtleta(new AtletaProfissional("Ana Santos", 0, null, 0, null, 0, 0, 0));
        String expResult = "Ana Santos";
        String result = instance.sortAtletas().get(0).getNome();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of atletasPremioInversamente method, of class ClubeDesportivo.
     */
    @Ignore
    public void testAtletasPremioInversamente() {
        System.out.println("atletasPremioInversamente");
        ClubeDesportivo instance = new ClubeDesportivo();
        List<Atleta> expResult = null;
        List<Atleta> result = instance.atletasPremioInversamente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalIrs method, of class ClubeDesportivo.
     */
    @Ignore
    public void testCalcularTotalIrs() {
        System.out.println("calcularTotalIrs");
        ClubeDesportivo instance = new ClubeDesportivo();
        float expResult = 0.0F;
        float result = instance.calcularTotalIrs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdenadaCategoriaModalidadeNome method, of class ClubeDesportivo.
     */
    @Ignore
    public void testGetOrdenadaCategoriaModalidadeNome() {
        System.out.println("getOrdenadaCategoriaModalidadeNome");
        ClubeDesportivo instance = new ClubeDesportivo();
        List<Atleta> expResult = null;
        List<Atleta> result = instance.getOrdenadaCategoriaModalidadeNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
