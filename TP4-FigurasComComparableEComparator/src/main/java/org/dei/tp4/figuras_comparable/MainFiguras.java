
package org.dei.tp4.figuras_comparable;
// comparar com os critérios do compareTo (-1, 0 e 1)
import java.util.ArrayList;
import java.util.Collections;
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

        List<Figura> figuras = new ArrayList<>();
        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);

        System.out.println("\n### Figuras Armazenadas no ArrayList (foreach) ###");
        listarForEach(figuras);
        
        System.out.println("\n###### Ordenação de Objetos Comparable ######");

        System.out.println("\n\t# Figuras por Ordem Crescente da Área #");
        // a classe Collections permite muitas opções como sort, reverse, rotate, etc.
        // o sort só funciona, porque figuras foi declarado um ArrayList do tipo Figura que por sua vez tem implementado o Comparable
        Collections.sort(figuras);
        listarForEach(figuras);

        System.out.println("\n\t# Figuras por Ordem Decrescente da Área #");
        Collections.sort(figuras, Collections.reverseOrder());
//        // Alternativa: (reverse depois do sort que já aconteceu anteriormente - linha 39)
//        Collections.reverse(figuras);
        listarForEach(figuras);

    }

    private static void listarForEach(List<Figura> lista) {
        for (Figura figura : lista) {
            System.out.printf("%s Área: %.1f %n", figura.toString(), figura.calcularArea());
        }
    }

}
