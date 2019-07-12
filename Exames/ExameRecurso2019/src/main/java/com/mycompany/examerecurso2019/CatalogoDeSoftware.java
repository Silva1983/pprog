/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examerecurso2019;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author ssilv
 */
public class CatalogoDeSoftware extends Software{
    
    public boolean guardarCatalogo(Software obj, File ficheiro)throws IOException{
        try{
            ObjectOutputStream objSoftware = new ObjectOutputStream(new FileOutputStream (ficheiro));
            try{
                objSoftware.writeObject(obj);   
            }finally{
                objSoftware.close();
            }
            return true;
        }catch(IOException e){
            return false;
        }
    }
}
