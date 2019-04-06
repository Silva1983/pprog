package vencimentosComparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listar(trabs);
        //3. a)
        System.out.println("/n### Trabalhadores (ordem cresc. vencimentos)");
        Collections.sort(trabs);
        listar(trabs);
        //b)
        System.out.println("/n### Trabalhadores (ordem decresc. vencimentos)");
        Collections.sort(trabs, Collections.reverseOrder());
        listar(trabs);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(),
                        trab.calcularVencimento());
            }
        }
    }

}
