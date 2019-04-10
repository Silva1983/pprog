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
     * Insere uma nova lista de atletas
     *
     * @param novaListaAtletas
     */
    public void setAtletas(List<Atleta> novaListaAtletas) {
        atletas = new ArrayList<>(novaListaAtletas);
    }

    // 1.
    /**
     * Devolve o nome do fundação do clube
     *
     * @return nome
     */
    @Override
    public String toString() {
        return String.format("%nNome do Clube: %s%n", nome);
    }

    // 2.
    /**
     * Adiciona um atleta ao clube
     *
     * @param novoAtleta
     */
    public void adicionarAtleta(Atleta novoAtleta) {
        atletas.add(novoAtleta);
    }

    // 3.
    /**
     * Ordena a lista de atletas do clube desportivo ordenada alfabeticamente
     * por nome
     *
     * @return listaOrdenada - lista ordenada alfabeticamente por nome
     */
    public List<Atleta> sortAtletas() {
        List<Atleta> listaOrdenada = getAtletas();
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    // 4.
    /**
     * Devolve a lista ordenada por prémios inversamente
     *
     * @return listaOrdenada
     */
    public List<Atleta> atletasPremioInversamente() {
        List<Atleta> listaOrdenada = getAtletas();
        Collections.sort(listaOrdenada, Collections.reverseOrder(new CompararPremio()));
        return listaOrdenada;
    }

    /**
     * Classe com o critério para comparar os prémios
     */
    class CompararPremio implements Comparator<Atleta> {

        /**
         * Compara o valor total mensal de prémios recebidos do atleta e do
         * outro recebido por parâmetro
         *
         * @param a1 - atleta inicial
         * @param a2 - atleta a ser compararado com o atleta inicial
         * @return 1 (o valor do a1 é maior que do a2), -1 (o valor do a1 é
         * menor que do a2) ou 0 (o valor do a1 é igual ao do a2)
         */
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

    // 5.
    /**
     * Permite o cálculo do valor total do IRS a descontar da totalidade dos
     * atletas sujeitos à taxa de IRS
     *
     * @return valor total do IRS da totalidade dos atletas
     */
    public float calcularTotalIrs() {
        float total = 0;
        CalcularIrs irs;
        for (int i = 0; i < atletas.size(); i++) {
            if (atletas.get(i) instanceof AtletaProfissional) {
                total = total + ((AtletaProfissional) atletas.get(i)).calcularIrs();
            }
            if (atletas.get(i) instanceof AtletaSemiProfissional) {
                total = total + ((AtletaSemiProfissional) atletas.get(i)).calcularIrs();
            }
        }
        return total;
    }

    // 6.
    /**
     * Devolve a lista ordenada alfabeticamente por categoria, modalidade e nome
     *
     * @return listaOrdenada
     */
    public List<Atleta> getOrdenadaCategoriaModalidadeNome() {
        List<Atleta> listaOrdenada = getAtletas();
        Collections.sort(listaOrdenada, new CompararCategoriaModalidadeNome());
        return listaOrdenada;
    }

    /**
     * Classe com o critério para comparar alfabeticamente um atleta por
     * categoria, modalidade e nome
     */
    class CompararCategoriaModalidadeNome implements Comparator<Atleta> {

        /**
         * Compara alfabeticamente a categoria, modalidade e nome do atleta e do
         * outro recebido por parâmetro
         *
         * @param a1 - atleta inicial
         * @param a2 - atleta a ser compararado com o atleta inicial
         * @return res - 1 (a1 é maior que a2), -1 (a1 é menor que a2) ou 0 (a1
         * é igual ao a2)
         */
        @Override
        public int compare(Atleta a1, Atleta a2) {
            int res = (a1.getClass().getSimpleName().compareToIgnoreCase(a2.getClass().getSimpleName()));
            if (res == 0) {
                res = a1.getAtividade().compareToIgnoreCase(a2.getAtividade());
            }
            if (res == 0) {
                res = a1.compareTo(a2);
            }
            return res;
        }
    }
}
