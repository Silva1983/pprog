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
public class SoftwareComercialExperimental extends Software implements Experimentavel{
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

    public boolean isPublicidade() {
        return publicidade;
    }

    public void setPublicidade(boolean publicidade) {
        this.publicidade = publicidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoftwareComercialExperimental other = (SoftwareComercialExperimental) obj;
        if (!Objects.equals(this.nomeEmpresa, other.nomeEmpresa)) {
            return false;
        }
        if (Float.floatToIntBits(this.duracaoLicenca) != Float.floatToIntBits(other.duracaoLicenca)) {
            return false;
        }
        if (this.publicidade != other.publicidade) {
            return false;
        }
        return true;
    }
    
    
}
