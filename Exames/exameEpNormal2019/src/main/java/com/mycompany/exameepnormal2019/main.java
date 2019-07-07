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
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.List;

public class main {
    public static void main(String[] args) throws ArgumentoInvalidoException, InputMismatchException{
        Scanner ler = new Scanner (System.in);
        
        //Questão 1:
        Proprietario pr = new Proprietario();
            System.out.println("Nome: ");
            String nome = ler.nextLine();
            pr.setNome(nome);
            System.out.println("Nif: ");
            int nif = ler.nextInt();
            pr.setNif(nif);
            ler.nextLine();
            System.out.println("Email: ");
            String email = ler.nextLine();
            pr.setEmail(email);
                
            boolean dadosInvalidos = true;
            do{
                System.out.println("Telemóvel: ");
                int telemovel = ler.nextInt();
                
                try{
                
                    pr.setNmTelefone(telemovel);
                    dadosInvalidos = false;
                
                }catch (ArgumentoInvalidoException aie){
                
                    System.out.println(aie.getMessage());
            
                }catch (InputMismatchException ime) {
                
                    System.out.println("Número de telemóvel é um valor inteiro");
                    ler.nextLine();
                }
            }while(dadosInvalidos );
        
        //System.out.println(pr.toString());
        
        //Questão 2:
        /*
        ArrayList<Imovel> imoveis = new ArrayList<>();
        imoveis.add(new Apartamento("Rua de cima", "Sitio", 500, 2500, 4);
        proprietarios.add(new Proprietario("Ricardo", 123456, "sem@email.com", 938543456));
        
        private static void listarProprietarios(List<Proprietario>lista){
            for(Proprietario proprietarios: lista){
                System.out.println(proprietarios.toString());
            }
        }
        */
    }
}
