/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examerecurso2019;

import java.util.List;

/**
 *
 * @author ssilv
 */
public class SoftwareComercialIntegral extends Software{
    private String nomeEmpresa;
    private float duracaoLicenca;
    private float preco;
    
    private static final String NOME_EMPRESA_OMISSAO = "Sem nome";
    private static final int DURACAO_LICENCA_OMISSAO = 0;
    private static final int PRECO_POR_OMISSAO = 0;
    
    public SoftwareComercialIntegral(){
        super();
        this.nomeEmpresa = NOME_EMPRESA_OMISSAO;
        this.duracaoLicenca = DURACAO_LICENCA_OMISSAO;
        this.preco = PRECO_POR_OMISSAO;
    }
    
    public SoftwareComercialIntegral(String nome, String plataforma, String acronimo, List<Software>programas, String nomeEmpresa, float duracaoLicenca, float preco){
        super(nome, plataforma, acronimo, programas);
        this.nomeEmpresa = nomeEmpresa;
        this.duracaoLicenca = duracaoLicenca;
        this.preco = preco;
    }
    
}
