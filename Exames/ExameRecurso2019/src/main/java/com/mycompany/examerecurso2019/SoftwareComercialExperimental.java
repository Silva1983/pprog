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
public class SoftwareComercialExperimental extends Software{
    private String nomeEmpresa;
    private float duracaoLicenca;
    private boolean publicidade;
    
    private static final String NOME_EMPRESA_OMISSAO = "sem nome";
    private static final int DURACAO_LICENCA_OMISSAO = 0;
    private static final boolean PUBLICIDADE_POR_OMISSAO = false;
    
    public SoftwareComercialExperimental(){
        super();
        this.nomeEmpresa = NOME_EMPRESA_OMISSAO;
        this.duracaoLicenca = DURACAO_LICENCA_OMISSAO;
        this.publicidade = PUBLICIDADE_POR_OMISSAO;
    }
    
    public SoftwareComercialExperimental(String nome, String plataforma, String acronimo, List<Software>programas, String nomeEmpresa, float duracaoLicenca, boolean publicidade){
        super(nome, plataforma, acronimo, programas);
        this.nomeEmpresa = nomeEmpresa;
        this.duracaoLicenca = duracaoLicenca;
        this.publicidade = publicidade;
    }
}
