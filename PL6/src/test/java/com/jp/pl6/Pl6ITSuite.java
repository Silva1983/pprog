/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl6;

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
@Suite.SuiteClasses({com.jp.pl6.TrabalhadorContaPropriaIT.class, com.jp.pl6.ContribuinteSemRendimentosIT.class, com.jp.pl6.DesempregadoIT.class, com.jp.pl6.TrabalhadorContaOutremIT.class, com.jp.pl6.MainContribuinteIT.class, com.jp.pl6.ContribuinteIT.class, com.jp.pl6.ReformadoIT.class})
public class Pl6ITSuite {

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
