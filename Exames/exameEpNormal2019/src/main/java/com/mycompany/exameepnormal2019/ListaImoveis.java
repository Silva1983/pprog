/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exameepnormal2019;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ssilv
 */
public class ListaImoveis {
    
    private List<Imovel>imoveis;
    
    public ListaImoveis(){
        this.imoveis = new ArrayList<>();
    }
    
    public ListaImoveis(List<Imovel>imoveis){
        this.imoveis = new ArrayList<>(imoveis);
    }
    
    public ArrayList<Imovel>getImoveis(){
        return new ArrayList<>(imoveis);
    }
    
    public void setImoveis(List<Imovel>novaListaImoveis){
        imoveis = new ArrayList<>(novaListaImoveis);
    }
    
    public void eliminarImovel(Imovel removeAtleta){
        imoveis.remove(removeAtleta);
    }
   /* 
    public List<Imovel>getOrdenacaoPorLocalidade(){
        
    }
    */
    
    public void calcularImoveis(ArrayList<Imovel>imoveis){
        for(Imovel i: imoveis){
            System.out.println(i.getImoveis().toString() + i.valorImovel());
        }
    }
    
    public boolean exportarParaFicheiro(ArrayList<Imovel> obj, File ficheiro)throws IOException{
        try{
            ObjectOutputStream objImovel = new ObjectOutputStream(new FileOutputStream(ficheiro));
            try{
                objImovel.writeObject(obj);   
            }finally{
                objImovel.close();
            }
            return true;
        }catch(IOException e){
            return false;
        }
    }
}
