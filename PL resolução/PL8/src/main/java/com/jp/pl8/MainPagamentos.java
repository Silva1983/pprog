/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl8;

/**
 *
 * @author ASUS
 */
public class MainPagamentos {

    public static void main(String[] args) {

        Professor p1 = new Professor("João Miguel", "123456ZY2", "Adjunto", 5000);
        Aluno a1 = new Aluno("Pedro Santos", 1161874);
        AlunoBolseiro ab1 = new AlunoBolseiro("Joana Pereira", 1171874, 500);

        Pessoa[] elementosEscola = new Pessoa[10];

        elementosEscola[0] = p1;
        elementosEscola[1] = a1;
        elementosEscola[2] = ab1;

        for (int i = 0; i < elementosEscola.length; i++) {
            if (elementosEscola[i] instanceof Professor) {
                System.out.printf("Nome Professor: %s%nCategoria: %s%n", elementosEscola[i].getNome(), 
                        ((Professor) elementosEscola[i]).getCategoria());
            }
            
            if (elementosEscola[i] instanceof Aluno && !(elementosEscola[i] instanceof AlunoBolseiro)) {
                System.out.println(elementosEscola[i].toString());
            }
        }
    }
}
