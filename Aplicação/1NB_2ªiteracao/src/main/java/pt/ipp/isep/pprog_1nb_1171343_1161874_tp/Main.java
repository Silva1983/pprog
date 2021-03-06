package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

import pt.ipp.isep.biblioteca.Data;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Atleta> atletas = new ArrayList<>();

        //a
        ClubeDesportivo c1 = new ClubeDesportivo("FC Porto", new Data(1893, 9, 28), atletas);

        //b
        atletas.add(new AtletaProfissional("João Pimentel", 14785289, "masculino", 34, "ciclismo", 60, 100, 250));
        atletas.add(new AtletaProfissional("Juliana Rangel", 15236847, "feminino", 34, "natação", 70, 150, 300));
        atletas.add(new AtletaProfissional("Sara Cunha", 12345678, "feminino", 26, "natação", 100, 250, 300));
        atletas.add(new AtletaSemiProfissional("António Silva", 25486319, "masculino", 36, "caminhada", 75, 200, 25));
        atletas.add(new AtletaSemiProfissional("Sara Gomes", 23654782, "feminino", 36, "ciclismo", 80, 150, 15));
        atletas.add(new AtletaSemiProfissional("Maria Martins", 23654781, "feminino", 25, "corrida", 60, 120, 5));
        atletas.add(new AtletaAmador("Miguel Sousa", 12365489, "masculino", 27, "corrida", 70, 200, 10));
        atletas.add(new AtletaAmador("Pedro Pereira", 23145678, "masculino", 40, "caminhada", 75, 170, 20));
        atletas.add(new AtletaAmador("José António", 19185389, "masculino", 34, "corrida", 80, 100, 4));
   
        c1.setAtletas(atletas);

        //c
        //1.
        System.out.println(c1.toString() + "Fundado em: " + c1.getDataFundacao().toString() + "\n");

        //2.
        c1.adicionarAtleta(new AtletaSemiProfissional("Ricardo Pereira", 826534521, "masculino", 35, "caminhada", 150, 100, 12));

        //3.
        System.out.println("### Lista de Atletas (ordenada alfabeticamente por nome) ###");
        listarForEach(c1.sortAtletas());

        //4.
        System.out.println("\n### Lista de Atletas (ordenada inversamente pelo valor dos prémios) ###");
        listarForEachPremio(c1.atletasPremioInversamente());

        //5.
        System.out.println("\n### Valor Total IRS (todos os atletas) ###");
        System.out.println(c1.calcularTotalIrs());

        //6.
        System.out.println("\n### Lista de Atletas (ordenada alfabeticamente por categoria, modalidade e nome) ###");
        listarForEachNomeModalidade(c1.getOrdenadaCategoriaModalidadeNome());

    }

    // ### UTILITÁRIOS TP2 ##
    /**
     * Listagem com o nome de todos os atletas
     *
     * @param lista - ArrayList
     */
    private static void listarForEach(List<Atleta> lista) {
        for (Atleta atletas : lista) {
            System.out.printf(atletas.toNomeIdadeAtividadeString());
        }
    }

    /**
     * Listagem com o nome e valor dos prémios de todos os atletas
     *
     * @param lista - ArrayList
     */
    private static void listarForEachPremio(List<Atleta> lista) {
        for (Atleta atletas : lista) {
            System.out.printf(atletas.toNomePremioString());
        }
    }

    private static void listarForEachNomeModalidade(List<Atleta> lista) {
        for (Atleta atletas : lista) {
            System.out.printf(atletas.toNomeAtividadeString());
        }
    }

}

//    // ### TP1 - Main ###
//    
//        AtletaProfissional ap1 = new AtletaProfissional("João Pimentel", 14785289, "masculino", 34, "ciclismo", 60, 100, 250);
//        AtletaProfissional ap2 = new AtletaProfissional("Juliana Rangel", 15236847, "feminino", 34, "natação", 70, 150, 500);
//        AtletaSemiProfissional asp1 = new AtletaSemiProfissional("António Silva", 25486319, "masculino", 36, "caminhada", 75, 200, 25);
//        AtletaSemiProfissional asp2 = new AtletaSemiProfissional("Sara Gomes", 23654782, "feminino", 36, "ciclismo", 80, 150, 15);
//        AtletaSemiProfissional asp3 = new AtletaSemiProfissional("Maria Martins", 23654781, "feminino", 25, "corrida", 60, 100, 5);
//        AtletaAmador aa1 = new AtletaAmador("Miguel Sousa", 12365489, "masculino", 27, "corrida", 70, 10, 200);
//        AtletaAmador aa2 = new AtletaAmador("Pedro Pereira", 23145678, "masculino", 40, "caminhada", 75, 20, 100);
//        /**
//         * b)
//         */
//        List<Atleta> atletas = new ArrayList<>();
//        atletas.add(ap1);
//        atletas.add(ap2);
//        atletas.add(asp1);
//        atletas.add(asp2);
//        atletas.add(asp3);
//        atletas.add(aa1);
//        atletas.add(aa2);
//
//        /**
//         * c)
//         */
//        System.out.println("### Listagem FCM e FCT (atletas amadores e semiprofissionais) ###");
//        listaUm(atletas);
//        System.out.println("### Listagem Completa de Valores a Pagar ###");
//        listaDois(atletas);
//
//        /**
//         * d)
//         */
//        System.out.println("Quantidade de Atletas Amadores: " + AtletaAmador.getContadorAtletaAmador());
//        System.out.println("Quantidade de Atletas Profissionais: " + AtletaProfissional.getContadorAtletaProfissional());
//
//        /**
//         * e)
//         */
//        System.out.println("### Total a Pagar ###");
//        System.out.println(valorTotalPagar(atletas));
//
//        System.out.println("### Listagem Completa Atletas ###");
//        listarForEach(atletas);
//    
//    }
//    // ### UTILITÁRIOS TP1 ###
//    
//
//    /**
//     * listagem de todos os atletas e suas características
//     *
//     * @param lista - ArrayList
//     */
//    private static void listarForEach(List<Atleta> lista) {
//        for (Atleta atletas : lista) {
//            System.out.printf(atletas.toString());
//        }
//    }
//
//    /**
//     * listagem (com o nome, o FCM e os FCT's) de todos os atletas
//     * semiprofissionais e amadores
//     *
//     * @param lista - ArrayList
//     */
//    private static void listaUm(List<Atleta> lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i) instanceof AtletaSemiProfissional || lista.get(i) instanceof AtletaAmador) {
//                System.out.println(lista.get(i).toStringLista1());
//            }
//        }
//    }
//
//    /**
//     * listagem de todos os atletas com o nome e o valor mensal a pagar a cada
//     * um
//     *
//     * @param lista - ArrayList
//     */
//    private static void listaDois(List<Atleta> lista) {
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i).toStringLista2());
//        }
//    }
//
//    /**
//     * listagem com o valor total a pagar por cada tipo de atleta e o valor total a
//     * pagar a todos os atletas
//     *
//     * @param lista - ArrayList
//     */
//    private static String valorTotalPagar(List<Atleta> lista) {
//        float totalProfissional = 0;
//        float totalSemiProfissional = 0;
//        float totalAmador = 0;
//        float totalGeral = 0;
//
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i) instanceof AtletaProfissional) {
//                totalProfissional = (float) totalProfissional + lista.get(i).calcularValorMensal();
//                totalGeral = totalGeral + lista.get(i).calcularValorMensal();
//            } else if (lista.get(i) instanceof AtletaSemiProfissional && !(lista.get(i) instanceof AtletaAmador)) {
//                totalSemiProfissional = (float) totalSemiProfissional + lista.get(i).calcularValorMensal();
//                totalGeral = totalGeral + lista.get(i).calcularValorMensal();
//            } else {
//                totalAmador = (float) totalAmador + lista.get(i).calcularValorMensal();
//                totalGeral = totalGeral + lista.get(i).calcularValorMensal();
//            }
//        }
//
//        return String.format("Total Atletas Profissionais: %.2f%nTotal Atletas Semiprofissionais: %.2f%n"
//                + "Total Atletas Amadores: %.2f%nTotal Geral: %.2f%n",
//                totalProfissional, totalSemiProfissional, totalAmador, totalGeral);
//    }
//}
