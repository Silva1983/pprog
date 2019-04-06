package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

import pt.ipp.isep.biblioteca.Data;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class ClubeDesportivo {

    /**
     * Nome do clube desportivo
     */
    private String nome;

    /**
     * Data de fundação do clube desportivo
     */
    private Data dataFundacao;

    /**
     * O nome por omissao do clube desportivo
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Inicializa a lista de atletas
     */
    private List<Atleta> atletas;

    /**
     * Inicializa o construtor do clube desportivo
     */
    public ClubeDesportivo() {
        nome = NOME_POR_OMISSAO;
        dataFundacao = new Data();
        atletas = new ArrayList<>();
    }

    /**
     * Inicializa o construtor clube desportivo com o nome e data de fundação
     * recebidos
     *
     * @param nome - nome do clube desportivo
     * @param dataFundacao - data de fundação do clube
     * @param atletas - arraylist com os atletas do clube
     */
    public ClubeDesportivo(String nome, Data dataFundacao, List<Atleta> atletas) {
        this.nome = nome;
        this.dataFundacao = new Data(dataFundacao);
        this.atletas = new ArrayList<>(atletas);
    }

    // 1.
    /**
     * Devolve o nome do clube desportivo
     *
     * @return nome do clube desportivo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do clube desportivo
     *
     * @param nome - novo nome do clube desportivo
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve a data de fundação do clube desportivo
     *
     * @return data de fundação do clube
     */
    public Data getDataFundacao() {
        return new Data(dataFundacao);
    }

    /**
     * Modifica a data de fundação do clube desportivo
     *
     * @param dataFundacao - nova data de fundação do clube
     */
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao.setData(dataFundacao.getAno(), dataFundacao.getMes(), dataFundacao.getDia());
    }

    /**
     * Devolve uma lista com todos os atletas do clube desportivo
     *
     * @return lista dos atletas do clube
     */
    public ArrayList<Atleta> getAtletas() {
        return new ArrayList<>(atletas);
    }

    /**
     * Ordena a lista de atletas do clube desportivo
     *
     * @return listaOrdenada - lista ordenada alfabeticamente
     */
    public List<Atleta> sortAtletas() {
        List<Atleta> listaOrdenada = this.getAtletas();
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    /**
     * Modifica os elementos da lista Atleta
     *
     * @param atletas
     */
    public void setAtletas(List<Atleta> atletas) {
        List<Atleta> copy = new ArrayList<>();
        for (Atleta Atleta : atletas) {
            copy.add(Atleta);
        }
        this.atletas = copy;
    }

    // 2.
    /**
     * adicionar Atleta à lista
     *
     * @param atletas
     */
    public void adicionarAtleta(Atleta atletas) {
        
        this.atletas.add(atletas);
        
    }

    /**
     * Remover atleta da lista não é pedido no enunciado
     *
     * @param atletas
     */
    public void removerAtleta(Atleta atletas) {
        this.atletas.remove(atletas);
    }

    // 3.
    /**
     * Devolve a lista ordenada por nome
     *
     * @return sortedList - Lista ordenada por nome
     */
    public List<Atleta> getAtletasOrdenadoNome() {
        List<Atleta> sortedList = this.getAtletas();
        Collections.sort(sortedList, new CompareByName());
        return sortedList;
    }

    // 4.
    /**
     * Devolve a lista ordenada por prémios inversamente
     *
     * @return sortedList - Lista ordenada
     */
    public List<Atleta> atletasPremioInversamente() {
        List<Atleta> sortedList = this.getAtletas();
        Collections.sort(sortedList, Collections.reverseOrder(new CompararPremioInversamente()));
        return sortedList;
    }

    /**
     * Calcular os prémios dos atletas Profissionais
     *
     * @return premios
     */
    public double calcularPremiosProfissional() {
        double premios = 0;
        for (Atleta atletas : getAtletas()) {
            if (atletas instanceof AtletaProfissional) {
                premios = premios + atletas.getValorMensalPremios();
            }
        }
        return premios;
    }

    /**
     * Calcular premios dos atletas Amadoras
     *
     * @return premios
     */
    public double calcularPremiosAmador() {
        double premios = 0;
        for (Atleta atletas : getAtletas()) {
            if (atletas instanceof AtletaAmador) {
                premios = premios + atletas.getValorMensalPremios();
            }
        }
        return premios;
    }

    /**
     * Calcular premios dos atletas Semi Profissionais
     *
     * @return premios
     */
    public double calcularPremiosSemiProfissional() {
        double premios = 0;
        for (Atleta atletas : getAtletas()) {
            if (atletas instanceof AtletaSemiProfissional) {
                premios = premios + atletas.getValorMensalPremios();
            }
        }
        return premios;
    }

    /**
     * Calcular total dos valores prémios dos atletas
     *
     * @return total
     */
    public double calcularTotalValorPremios() {
        double total = 0;
        for (Atleta atletas : getAtletas()) {
            total = total + atletas.getValorMensalPremios();
        }
        return total;
    }

    /**
     * Devolve a quantidade e atletas
     *
     * @return atletas - quantidade de atletas
     */
    public int getQuantidadeAtletas() {
        return atletas.size();
    }

    // 6.
    /**
     *
     * @return
     */
    public List<Atleta> getOrdenadaCategoriaModalidadeNome() {
        List<Atleta> ListaOrdenada = this.getAtletas();
        Collections.sort(ListaOrdenada, new CompararCategoriaModalidadeNome());
        return ListaOrdenada;
    }

    public ClubeDesportivo copia() {
        return new ClubeDesportivo(getNome(), getDataFundacao(), getAtletas());
    }

    /**
     * Class para comparar nomes Atleta usando Comparator
     */
    class CompareByName implements Comparator<Atleta> {

        @Override
        public int compare(Atleta a1, Atleta a2) {
            if (a1.getClass() != a2.getClass()) {
                return a1.getClass().toString().compareTo(a2.getClass().toString());
            }
            return a1.getNome().compareTo(a2.getNome());
        }
    }

    /**
     * Class para comparar prémios usando Comparator
     */
    class CompararPremioInversamente implements Comparator<Atleta> {

        @Override
        public int compare(Atleta a1, Atleta a2) {
            if (a1.getValorMensalPremios() > a2.getValorMensalPremios()) {
                return 1;
            }
            if (a1.getValorMensalPremios() < a2.getValorMensalPremios()) {
                return -1;
            }
            return 0;
        }
    }

    /**
     * Class para comparar...
     */
    class CompararCategoriaModalidadeNome implements Comparator<Atleta> {
        /**
         * Compara alfabeticamente as categorias entre 2 atletas
         * 
         * @param a1
         * @param a2
         * @return 
         */
        @Override
        public int compare(Atleta a1, Atleta a2) {
            if (!a1.getClass().getSimpleName().equalsIgnoreCase(a2.getClass().getSimpleName())) {
                return a1.getClass().getSimpleName().compareTo(a2.getClass().getSimpleName());
            }
            return 0;
        }
    }
}
