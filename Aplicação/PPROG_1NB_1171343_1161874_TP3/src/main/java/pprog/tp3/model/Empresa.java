package pprog.tp3.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma empresa através da sua designação, NIF e utilizadores
 *
 * @author João (1161874)
 */
public class Empresa {

    /**
     * Designação da empresa
     */
    private String designacao;

    /**
     * NIF da empresa
     */
    private String nif;

    /**
     * Designação por omissao da empresa
     */
    private static final String DESIGNACAO_POR_OMISSAO = "sem designacao";

    /**
     * NIF por omissao da empresa
     */
    private static final String NIF_POR_OMISSAO = "sem NIF";

    /**
     * Inicializa a lista de utilizadores
     */
    private List<Utilizador> utilizadores;

    /**
     * Inicializa a lista de categorias
     */
    private List<Categoria> categorias;

    /**
     * Inicializa a lista de serviços
     */
    private List<Servico> servicos;

    /**
     * Inicializa os pedidos de prestção de serviço
     */
    private List<PedidoPrestacaoServico> pedidosPrestacaoServico;

    /**
     * Inicializa o construtor da empresa
     */
    public Empresa() {
        designacao = DESIGNACAO_POR_OMISSAO;
        nif = NIF_POR_OMISSAO;
        utilizadores = new ArrayList<>();
        servicos = new ArrayList<>();
        pedidosPrestacaoServico = new ArrayList<>();
    }

    /**
     * Inicializa o construtor empresa com a designação, NIF, lista de
     * utilizadores, catero
     *
     * @param designacao - designacao da empresa
     * @param nif - NIF da empresa
     * utilizadores - arraylist com os utilizadores da empresa
     * servicos - arraylist com os serviços da empresa
     * pedidosPrestacaoServico - pedidos de prestação de serviço
     */
    public Empresa(String designacao, String nif) {
        this.designacao = designacao;
        this.nif = nif;
        this.utilizadores = new ArrayList<>();
        this.servicos = new ArrayList<>();
        this.pedidosPrestacaoServico = new ArrayList<>();
    }

    /**
     * Devolve a designação da empresa
     *
     * @return designacao da empresa
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Modifica a designação da empresa
     *
     * @param designacao - novo designacao da empresa
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Devolve o NIF da empresa
     *
     * @return nif da empresa
     */
    public String getNif() {
        return nif;
    }

    /**
     * Modifica o NIF da empresa
     *
     * @param nif - novo nif da empresa
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Devolve uma lista com todos os utilizadores da empresa
     *
     * @return lista dos utilizadores da empresa
     */
    public List<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    /**
     * Insere uma nova lista de utilizadores
     *
     * @param utilizadores
     */
    public void setUtilizadores(List<Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    /**
     * Devolve uma lista com todas as categorias da empresa
     *
     * @return lista das categorias da empresa
     */
    public ArrayList<Categoria> getCategorias() {
        return new ArrayList<>(categorias);
    }

    /**
     * Insere uma nova lista de categorias
     *
     * @param novaListaCategorias
     */
    public void setCategorias(List<Categoria> novaListaCategorias) {
        categorias = new ArrayList<>(novaListaCategorias);
    }

    /**
     * Devolve uma lista com todos os serviços da empresa
     *
     * @return lista dos serviços da empresa
     */
    public ArrayList<Servico> getServicos() {
        return new ArrayList<>(servicos);
    }

    /**
     * Insere uma nova lista de serviços
     *
     * @param novaListaServicos
     */
    public void setServicos(List<Servico> novaListaServicos) {
        servicos = new ArrayList<>(novaListaServicos);
    }

    public List<PedidoPrestacaoServico> getPedidosPrestacaoServico() {
        return pedidosPrestacaoServico;
    }

    public void setPedidosPrestacaoServico(List<PedidoPrestacaoServico> pedidosPrestacaoServico) {
        this.pedidosPrestacaoServico = pedidosPrestacaoServico;
    }

    /**
     * Devolve a informação da empresa
     *
     * @return designacao
     */
    @Override
    public String toString() {
        return String.format("%nEmpresa: %s%nNIF: %s%n", designacao, nif);
    }

    /**
     * Adiciona um utilizador à empresa
     *
     * @param novoUtilizador
     */
    public void addUtilizador(Utilizador novoUtilizador) {
        utilizadores.add(novoUtilizador);
    }
    
    public void addServico(Servico novoServico) {
        servicos.add(novoServico);
    }
    
    public void addPedidoPrestacaoServico(PedidoPrestacaoServico pedidoPrestacaoServico) {
        pedidosPrestacaoServico.add(pedidoPrestacaoServico);
    }

    /**
     * Verifica se existe um utilizador com o email inserido
     *
     * @param email do utilizador
     * @return resultado
     */
    public boolean checkUtilizadorByEmail(String email) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Pesquisa o utilizador através do email
     *
     * @param email do prestador
     * @return utilizador
     */
    public int getUtilizadorByEmail(String email) {
        for (Utilizador utilizador : utilizadores) {
            if (utilizador.getEmail().equalsIgnoreCase(email)) {
                return utilizadores.indexOf(utilizador);
            }
        }
        return -1;
    }
}
