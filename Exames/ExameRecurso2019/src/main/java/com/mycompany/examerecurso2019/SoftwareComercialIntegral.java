/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examerecurso2019;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ssilv
 */
public class SoftwareComercialIntegral extends Software implements Experimentavel{
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

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public float getDuracaoLicenca() {
        return duracaoLicenca;
    }

    public void setDuracaoLicenca(float duracaoLicenca) {
        this.duracaoLicenca = duracaoLicenca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoftwareComercialIntegral other = (SoftwareComercialIntegral) obj;
        if (!Objects.equals(this.nomeEmpresa, other.nomeEmpresa)) {
            return false;
        }
        if (Float.floatToIntBits(this.duracaoLicenca) != Float.floatToIntBits(other.duracaoLicenca)) {
            return false;
        }
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        return true;
    }
    
    
}
