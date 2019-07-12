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
public class SoftwareAberto extends Software implements Experimentavel{
    private static String []licenca = {"GNU", "GPL", "LGPL", "BSD", "Sem licenca"};
    private String licencaSoftware;
    
    private static final String LICENCA_POR_OMISSAO = "Sem licenca";
    
    public SoftwareAberto(){
        super();
        this.licencaSoftware = licenca[4];
    }
    
    public SoftwareAberto(String nome, String plataforma, String acronimo, List<Software>programas, String licencaSoftware){
        super(nome, plataforma, acronimo, programas);
        for(int i = 0; i<=3; i++){
                this.licencaSoftware = licenca[i];
        }
    }

    public String getLicencaSoftware() {
        return licencaSoftware;
    }

    public void setLicencaSoftware(String licencaSoftware) {
        this.licencaSoftware = licencaSoftware;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoftwareAberto other = (SoftwareAberto) obj;
        if (!Objects.equals(this.licencaSoftware, other.licencaSoftware)) {
            return false;
        }
        return true;
    }
    
    
}
