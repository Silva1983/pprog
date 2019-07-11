package pprog.tp3.model;

import pprog.tp3.biblioteca.Tempo;
import pprog.tp3.biblioteca.Data;

/**
 * Esta classe permite guarda a disponibilidade diária de prestação de serviços.
 *
 * @author António (1171343) & João (1161874)
 */
public class Disponibilidade {

    private Data dataInicio;
    private Data dataFim;
    private Tempo horaInicio;
    private Tempo horaFim;

    /**
     * Inicializa construtor Disponibilidade
     */
    public Disponibilidade() {
        dataInicio = new Data();
        horaInicio = new Tempo();
        dataFim = new Data();
        horaFim = new Tempo();
    }

    /**
     * Inicializa construtor Disponibilidade com dataInicio, horaInicio, dataFim, horaFim
     * 
     * @param dataInicio
     * @param horaInicio
     * @param dataFim
     * @param horaFim 
     */
    public Disponibilidade(Data dataInicio, Tempo horaInicio, Data dataFim, Tempo horaFim) {
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        this.dataFim = dataFim;
        this.horaFim = horaFim;
    }

    /**
     * Devolve Data inicial
     * 
     * @return data inicial
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Modifica Data inicial
     * 
     * @param dataInicio - nova data inicial
     */
    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Devolve data fim
     * 
     * @return data fim
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Modifica a data fim
     * 
     * @param dataFim - nova data final
     */
    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Devolve hora do inicio
     * 
     * @return hora inicial
     */
    public Tempo getHoraInicio() {
        return horaInicio;
    }

    /**
     * Modifica hora inicial
     * 
     * @param horaInicio - nova hora inicial
     */
    public void setHoraInicio(Tempo horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * Devolve hora final
     * 
     * @return hora final
     */
    public Tempo getHoraFim() {
        return horaFim;
    }

    /**
     * Modifica hora final
     * 
     * @param horaFim - nova hora final
     */
    public void setHoraFim(Tempo horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * Devolve intervalo da disponibilidade de tempo, data e horas
     * 
     * @return Disponibilidade
     */
    @Override
    public String toString() {
        return String.format("Período: de %s, %s horas até %s, %s horas%n", 
                dataInicio.toDiaMesString(), horaInicio.toStringHHMM(), dataFim.toDiaMesString(), horaFim.toStringHHMM());
    }
}
