/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jp.pl10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MainContribuinte {

    public static void main(String[] args) {

        List<Contribuinte> contribuintes = new ArrayList<>();

        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));
        
        System.out.println("\n ### Contribuintes ###");
        listarForEach(contribuintes);
        
    }

    private static void listarForEach(List<Contribuinte> lista) {
        for (Contribuinte contribuinte : lista) {
            System.out.printf("%n%s%nImposto Extra: %.2f%n",contribuinte.toString(), contribuinte.calcularImposto());
        }
        
    }

//        Reformado cr1 = new Reformado("António Silva", "Rua 25 de Abril, 10", 12500, 4500);
//        TrabalhadorContaOutrem tco1 = new TrabalhadorContaOutrem("José Pereira", "Avenida 25 de Abril, 7", "Randstad", 9500, 1500);
//        TrabalhadorContaPropria tcp1 = new TrabalhadorContaPropria("Pedro Sousa", "Praça do Comércio, 2", "Engenheiro", 5000, 51000);
//        Desempregado d1 = new Desempregado("Zé", "Lugar do Sossego, casa 2", 10000, 6);
//
//        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", cr1.toString(), cr1.calcularImposto());
//        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tco1.toString(), tco1.calcularImposto());
//        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tcp1.toString(), tcp1.calcularImposto());
//        System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), d1.calcularImposto());
//
//        System.out.println("4. a/b/c/d");
//        Object[] contribuintes = new Object[10];
//
//        contribuintes[0] = cr1;
//        contribuintes[1] = tco1;
//        contribuintes[2] = tcp1;
//        contribuintes[3] = d1;
//
//        for (int i = 0; i < contribuintes.length; i++) {
//            if (contribuintes[i] instanceof Reformado) {
//                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", contribuintes[i].toString(), ((Reformado) contribuintes[i]).calcularImposto());
//            }
//
//            if (contribuintes[i] instanceof TrabalhadorContaOutrem) {
//                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tco1.toString(), ((TrabalhadorContaOutrem) contribuintes[i]).calcularImposto());
//            }
//
//            if (contribuintes[i] instanceof TrabalhadorContaPropria) {
//                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", tcp1.toString(), ((TrabalhadorContaPropria) contribuintes[i]).calcularImposto());
//            }
//
//            if (contribuintes[i] instanceof Desempregado) {
//                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), ((Desempregado) contribuintes[i]).calcularImposto());
//            }
//        }
//
//        System.out.println("4. e/f");
//        Desempregado.setTaxa(.01f);
//
//        for (int i = 0; i < contribuintes.length; i++) {
//
//            if (contribuintes[i] instanceof Desempregado) {
//                System.out.printf("%s%nImposto extraordinário: %.2f%n%n", d1.toString(), ((Desempregado) contribuintes[i]).calcularImposto());
//            }
//        }
//}
}
