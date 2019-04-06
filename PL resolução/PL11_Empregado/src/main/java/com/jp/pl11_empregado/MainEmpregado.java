package com.jp.pl11_empregado;

import com.jp.pl11_utilitarios.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class MainEmpregado {

    public static void main(String[] args) {
        // a)   
        Data d1 = Data.dataAtual();
        System.out.println("a)\n" + d1.toAnoMesDiaString());
        // b)
        Tempo t1 = new Tempo(10, 20, 30);
        Tempo t2 = Tempo.tempoAtual();
        System.out.println("b)\n" + t1 + "\n" + t2);
        // c)
        Empregado e1 = new Empregado("João", "Miguel", d1, t1, t2);
        Empregado e2 = new Empregado("Juliana", "Santos", d1, t1, t2);
        System.out.println("c)\n" + e1);
        System.out.println("c)\n" + e2);
        // d)
        System.out.println("d)\nReferência Data igual: " + e1.getDataContrato().equals(e2.getDataContrato()));

        // e)
        System.out.println("e)\nReferência Tempo (horaEntrada) igual: " + e1.getHoraEntrada().equals(e2.getHoraEntrada()));
        System.out.println("Referência Tempo (horaSaida) igual: " + e1.getHoraSaida().equals(e2.getHoraSaida()));
        // f)
        d1.setData(2018, 7, 1);
        t1.setTempo(11, 10, 10);
        t2.setTempo(21, 10, 10);
        //g
        System.out.printf("g)%nData: %s%nTempos: %s e %s%nEmpregado: %s%n",
                d1.toAnoMesDiaString(), t1.toStringHHMMSS(), t2.toStringHHMMSS(), e1.toString());
        // h)
        e2.setDataContrato(new Data(2017, 7, 17));
        e2.setHoraEntrada(new Tempo(9, 0, 0));
        e2.setHoraSaida(new Tempo(18, 0, 0));
        // i)
        List<Empregado> listagem = new ArrayList<>();
        listagem.add(e1);
        listagem.add(e2);
        // j)
        System.out.println("j)");
        listarForEach(listagem);
        // k)
        System.out.println("k)");
        listaDois(listagem);
    }

    private static void listarForEach(List<Empregado> lista) {
        for (Empregado empregados : lista) {
            System.out.printf(empregados.toString());
        }
    }

    private static void listaDois(List<Empregado> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).calcularTempoContrato());
            System.out.println(lista.get(i).calcularPNT());
        }
    }
}
