/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;
/**
 *
 * @author ssilv
 */
public class Proprietario {
    private String nome;
    private int nif;
    private String email;
    private int nmTelefone;
    
    private final static String NOME_POR_OMISSAO = "Sem nome";
    private final static int NIF_POR_OMISSAO = 0;
    private final static String EMAIL_POR_OMISSAO = "Sem email";
    private final static int NMTELEFONE_POR_OMISSAO = 0;
    
    public Proprietario(){
        this.nome = NOME_POR_OMISSAO;
        this.nif = NIF_POR_OMISSAO;
        this.email = EMAIL_POR_OMISSAO;
        this.nmTelefone = NMTELEFONE_POR_OMISSAO;
    }
    
    public Proprietario(String nome, int nif, String email, int nmTelefone){
        this.nome = nome;
        this.nif = nif;
        this.email = email;
        this.nmTelefone = nmTelefone;
    }

    public Proprietario(Proprietario outroProprietario){
        this.nome = outroProprietario.nome;
        this.nif = outroProprietario.nif;
        this.email = outroProprietario.email;
        this.nmTelefone = outroProprietario.nmTelefone;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getNif(){
        return nif;
    }
    
    public String getEmail() {
        return email;
    }

    public int getNmTelefone(){
        return nmTelefone;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNif(int nif){
        this.nif = nif;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setNmTelefone(int nmTelefone) throws ArgumentoInvalidoException{
        
           if(this.nmTelefone <9999999 ){
               throw new ArgumentoInvalidoException ("Número inválido, introduza novo número");
           }
            this.nmTelefone = nmTelefone;
        }
  
    @Override
    public String toString(){
        return String.format("Proprietário: %s%nNIF: %d%nTelefone: %d%nEmail: %s%n ", this.nome,this.nif,this.nmTelefone, this.email);
    }
   
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Proprietario outroProp = (Proprietario) outroObjeto;
        return this.nome == outroProp.nome && nif == outroProp.nif && email == outroProp.email
                && nmTelefone == outroProp.nmTelefone;
    }

    
}
