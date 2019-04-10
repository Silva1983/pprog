
package org.dei.excecaoUnchecked;

import java.util.Scanner;
import java.util.InputMismatchException;
public class TestePessoa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //boolean nomeInvalido = true;
        boolean dadosInvalidos = true;
        Pessoa p = new Pessoa();

        do{
            System.out.print("Nome:");
            String nome = ler.nextLine();
            try{
                p.setNome(nome);
                
                System.out.print("Nº de ID Civil:");
                int idCivil = ler.nextInt();
                ler.nextLine();
                p.setIDCivil(idCivil);
                //nomeInvalido tem de ser passado a falso antes do catch
                //nomeInvalido = false;
                
                dadosInvalidos = false;
            }catch (ArgumentoForaDosLimitesException afle){
                System.out.println("Exceção (idCivil: " + afle.getMessage());
            }catch(IllegalArgumentException iae){
                System.out.println("Exceção (nome): " + iae.getMessage());
            } catch (InputMismatchException ime){
                System.out.println("IDCivil não é inteiro!");
                ler.nextLine();
            }
        }while (dadosInvalidos);


        System.out.println("\nPessoa: " + p);

    }

}
