
package org.dei.tp4.figuras_arraylist;

import java.util.ArrayList;
import java.util.List;

public class MainFiguras {

    public static void main(String[] args) {

        System.out.println("\n### Figuras Construídas ###");
        Circulo c1 = new Circulo();
        System.out.println(c1);

        Circulo c2 = new Circulo(5, "amarelo");
        System.out.println(c2);

        Retangulo r1 = new Retangulo();
        System.out.println(r1);

        Retangulo r2 = new Retangulo(5, 2, "azul");
        System.out.println(r2);

        List<Figura> figuras = new ArrayList<>(); // ao contrário de um array normal, posso armazenar uma quantidade ilimitada de objetos
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);
        
        System.out.println("\n### Figuras Armazenadas no ArrayList (for) ###");
        listarFor(figuras);
        System.out.println("\n### Figuras Armazenadas no ArrayList (foreach) ###");
        listarForEach(figuras);
        // For e ForEach - ambos fazem a mesma coisa (ForEach é mais simples de escrever)
    }
        // para passar por apenas alguns dos objetos da lista
    private static void listarFor(List<Figura> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Figura figura = lista.get(i);

            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }
        // para passar por todos os objetos da lista
    private static void listarForEach(List<Figura> lista) {
        for (Figura figura : lista) {
            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }

}
