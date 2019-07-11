package pprog.tp3.model;

import pprog.tp3.biblioteca.Data;
import pprog.tp3.biblioteca.Tempo;

/**
 * Esta classe permite realizar um pedido de prestação de serviço (ator
 * cliente).
 *
 * @author João (1161874)
 */
public class PedidoPrestacaoServico {

    private Cliente cliente;
    private Data dataPreferencia;
    private Tempo tempoPreferencia;
    private Tempo duracao;
    private String descricao;
    
    private static final String DESCRICAO_POR_OMISSAO = "sem descrição";

    /**
     * Inicializa o número do pedido
     */
    private static int numeroPedido = 0;

    private static final int NUMERO_POR_OMISSAO = 0;

    /**
     * Inicializa o construtor do pedido prestação de serviço por omissão
     */
    public PedidoPrestacaoServico() {
        cliente = new Cliente();
        dataPreferencia = new Data();
        tempoPreferencia = new Tempo();
        duracao = new Tempo();
        descricao = DESCRICAO_POR_OMISSAO;
        numeroPedido++;
    }

    public PedidoPrestacaoServico(Cliente cliente, Data dataPreferencia, Tempo tempoPreferencia,
            Tempo duracao, String descricao) {
        this.cliente = cliente;
        this.dataPreferencia = dataPreferencia;
        this.tempoPreferencia = tempoPreferencia;
        this.duracao = duracao;
        this.descricao = descricao;
        numeroPedido++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Data getDataPreferencia() {
        return dataPreferencia;
    }

    public void setDataPreferencia(Data dataPreferencia) {
        this.dataPreferencia = dataPreferencia;
    }

    public Tempo getTempoPreferencia() {
        return tempoPreferencia;
    }

    public void setTempoPreferencia(Tempo tempoPreferencia) {
        this.tempoPreferencia = tempoPreferencia;
    }

    public Tempo getDuracao() {
        return duracao;
    }

    public void setDuracao(Tempo duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Devolve o número do pedido
     *
     * @return numeroPedido
     */
    public static int getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Devolve a descrição textual do pedido
     *
     * @return caraterísticas do pedido
     */
    @Override
    public String toString() {
        return String.format("Pedido restação de serviço nº %d%nCliente: %s%nHorário: %s às %s%nDuração: %s%n",
                getNumeroPedido(), cliente.getNome(), dataPreferencia.toDiaMesString(), tempoPreferencia.toStringHHMM(), duracao.toStringHHMM());
    }

}
