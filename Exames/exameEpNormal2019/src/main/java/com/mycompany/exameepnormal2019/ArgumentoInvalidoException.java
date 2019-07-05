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
public class ArgumentoInvalidoException extends IllegalArgumentException{
    
    public ArgumentoInvalidoException(){
        super();
    }
    
    public ArgumentoInvalidoException(String message){
        super(message);
        
    }
    
    public ArgumentoInvalidoException(String message, Throwable cause){
        super(message, cause);
    }
    
    public ArgumentoInvalidoException(Throwable cause){
        super (cause);
    }
}
