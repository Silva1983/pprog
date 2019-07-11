/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examerecurso2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author ssilv
 */
public abstract class Software {
    private String nome;
    private String plataforma;
    private String acronimo;
    
    public List<Software>programas;
    
    private static final String NOME_POR_OMISSAO = "Sem nome";
    private static final String PLATAFORMA_POR_OMISSAO = "Sem plataforma";
    private static final String ACRONIMO_POR_OMISSAO = "Sem acronimo";
    
    public Software(){
        this.nome = NOME_POR_OMISSAO;
        this.plataforma = PLATAFORMA_POR_OMISSAO;
        this.acronimo = ACRONIMO_POR_OMISSAO;
        this.programas = new ArrayList<>();
    }
    
    public Software(String nome, String plataforma, String acronimo, List<Software>programas){
        this.nome = nome;
        this.plataforma = plataforma;
        this.acronimo = acronimo;
        this.programas = new ArrayList<>(programas);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    public void setAcronimo(String acronimo){
        this.acronimo = acronimo;
    }
    
    public void setProgramas(ArrayList<Software>novaListaProgramas){
        this.programas = new ArrayList<>(novaListaProgramas);
    }
    
    public String getNome(){
        return nome;
    }
    public String getPlataforma(){
        return plataforma;
    }
    
    public String getAcronimo(){
        return acronimo;
    }
    
    public ArrayList<Software>getSoftware(){
        return new ArrayList<>(programas);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Software other = (Software) obj;
        if (!Objects.equals(this.plataforma, other.plataforma)) {
            return false;
        }
        if (!Objects.equals(this.acronimo, other.acronimo)) {
            return false;
        }
        if (!Objects.equals(this.programas, other.programas)) {
            return false;
        }
        return true;
    }
    
    
}
