package com.jp.pl11_empregado;

import com.jp.pl11_utilitarios.Data;
import com.jp.pl11_utilitarios.Tempo;
// ou
// import com.jp.pl11_utilitarios.*;

/**
 *
 * @author ASUS
 */
public class Empregado {

    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private static final String PRIMEIRO_NOME_POR_OMISSAO = "sem primeiro nome";
    private static final String SEGUNDO_NOME_POR_OMISSAO = "sem segundo nome";

    public Empregado() {
        primeiroNome = PRIMEIRO_NOME_POR_OMISSAO;
        ultimoNome = SEGUNDO_NOME_POR_OMISSAO;
        dataContrato = new Data();
        horaEntrada = new Tempo();
        horaSaida = new Tempo();
    }

    public Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(dataContrato);
        this.horaEntrada = new Tempo(horaEntrada);
        this.horaSaida = new Tempo(horaSaida);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public Tempo getHoraEntrada() {
        return new Tempo (horaEntrada);
    }

    public Tempo getHoraSaida() {
        return new Tempo (horaSaida);
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato.setData(dataContrato.getAno(), 
                dataContrato.getMes(), dataContrato.getDia());
    }

    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada.setTempo(horaEntrada.getHoras(), 
                horaEntrada.getMinutos(), horaEntrada.getSegundos());
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida.setTempo(horaSaida.getHoras(), 
                horaSaida.getMinutos(), horaSaida.getSegundos());
    }
    
    @Override
    public String toString() {
        return String.format("Nome: %s %s%nData: %s%nHora Entrada: %s%nHora Saída: %s%n", 
                primeiroNome, ultimoNome, dataContrato.toString(), horaEntrada.toString(), horaSaida.toString());
    }
    
    public Tempo calcularPNT() {
        return (getHoraEntrada().diferencaEmTempo(getHoraSaida()));
    }
    
    public String calcularTempoContrato() {
        return String.format("Tempo Contrato: %s%n", Data.dataAtual().diferenca(getDataContrato()));
    }
    
}
