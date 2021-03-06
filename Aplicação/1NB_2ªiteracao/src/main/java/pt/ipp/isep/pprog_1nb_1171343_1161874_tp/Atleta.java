package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem diferentes tipos de atletas. Especifica membros comuns a todas
 * as classes da hierarquia.
 *
 * @author António (1171343) & João (1161874)
 */
public abstract class Atleta implements Comparable<Atleta> {

    /**
     * Nome do atleta
     */
    private String nome;

    /**
     * Número de identificação civil
     */
    private int numIdCivil;

    /**
     * Género do atleta
     */
    private String genero;

    /**
     * Idade do atleta
     */
    private int idade;

    /**
     * Atividade do atleta
     */
    private String atividade;

    /**
     * Frequência cardíaca em repouso do atleta
     */
    private int freqCardRepouso;

    /**
     * Valor mensal dos prémios arrecadados pelo atleta
     */
    private float valorMensalPremios;

    /**
     * O nome por omissao do atleta
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Número de identificação civil por omissão
     */
    private static final int NUMIDCIVIL_POR_OMISSAO = 0;

    /**
     * Género do atleta por omissao
     */
    private static final String GENERO_POR_OMISSAO = "sem genero";

    /**
     * Idade do atleta por omissão
     */
    private static final int IDADE_POR_OMISSAO = 0;

    /**
     * Atividade do atleta por omissão
     */
    private static final String ATIVIDADE_POR_OMISSAO = "sem atividade";

    /**
     * Frequência cardíaca do atleta por omissão
     */
    private static final int FREQCARDREPOUSO_POR_OMISSAO = 0;

    /**
     * Valor mensal dos prémios arrecadados pelo atleta por omissão
     */
    private static final float VALOR_MENSAL_PREMIOS_OMISSAO = 0;

    /**
     * Valor constante intensidade treino gordura
     */
    private static final float INTENSIDADE_TREINO_GORDURA = 0.6f;

    /**
     * Valor constante intensidade treinio cardiorrespiratorio
     */
    private static final float INTENSIDADE_TREINO_CARDIO = 0.75f;

    /**
     * Inicializa construtor do atleta por omissão
     */
    public Atleta() {
        nome = NOME_POR_OMISSAO;
        numIdCivil = NUMIDCIVIL_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        atividade = ATIVIDADE_POR_OMISSAO;
        freqCardRepouso = FREQCARDREPOUSO_POR_OMISSAO;
        valorMensalPremios = VALOR_MENSAL_PREMIOS_OMISSAO;
    }

    /**
     * Inicializa o construtor atleta com o nome, número de identificação civil,
     * género, idade, atividade, frequência cardíaca em repouso recebidos
     *
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação civil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequencia cardiaca em repouso do atleta
     * @param valorMensalPremios - valor mensal dos prémios arrecadados pelo
     * atleta
     */
    public Atleta(String nome, int numIdCivil, String genero, int idade,
            String atividade, int freqCardRepouso, float valorMensalPremios) {
        this.nome = nome;
        this.numIdCivil = numIdCivil;
        this.idade = idade;
        this.genero = genero;
        this.atividade = atividade;
        this.freqCardRepouso = freqCardRepouso;
        this.valorMensalPremios = valorMensalPremios;
    }

    /**
     * Devolve o nome do atleta
     *
     * @return nome do atleta
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do atleta
     *
     * @param nome o novo nome do atleta
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o número de identificação civil
     *
     * @return número de identificação civil
     */
    public int getNumIdCivil() {
        return numIdCivil;
    }

    /**
     * Modifica o número de identificação civil
     *
     * @param numIdCivil o novo numero de identificação civil
     */
    public void setNumIdCivil(int numIdCivil) {
        this.numIdCivil = numIdCivil;
    }

    /**
     * Devolve o género do atleta
     *
     * @return género do atleta
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Modifica o género do atleta
     *
     * @param genero o novo género do atleta
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devolve idade do atleta
     *
     * @return idade do atleta
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Modifica idade do atleta
     *
     * @param idade nova idade do atleta
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Devolve atividade do atleta
     *
     * @return atividade do atleta
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Modifica a atividade do atleta
     *
     * @param atividade nova atividade do atleta
     */
    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    /**
     * Devolve frequência cardíaca em repouso
     *
     * @return frequência cardíaca em repouso
     */
    public int getFreqCardRepouso() {
        return freqCardRepouso;
    }

    /**
     * Modifica a frequência cardíaca em repouso
     *
     * @param freqCardRepouso nova frequência cardíaca em repouso
     */
    public void setFreqCardRepouso(int freqCardRepouso) {
        this.freqCardRepouso = freqCardRepouso;
    }

    /**
     * Devolve valor mensal arrecadado em prémios
     *
     * @return valor mensal arrecadado em prémios
     */
    public float getValorMensalPremios() {
        return valorMensalPremios;
    }

    /**
     * Modifica valor mensal arrecadado em prémios
     *
     * @param valorMensalPremios valor mensal arrecadado em prémios
     */
    public void setValorMensalPremios(float valorMensalPremios) {
        this.valorMensalPremios = valorMensalPremios;
    }

    /**
     * Permite o cálculo da Frequência Cardíaca de Trabalho quando o objetivo é
     * a queima de gordura
     *
     * @return frequência cardíaca de trabalho
     */
    public static float getIntesidadeTreinoGordura() {
        return INTENSIDADE_TREINO_GORDURA;
    }

    /**
     * Permite o cálculo da Frequência Cardíaca de Trabalho quando o objetivo é
     * trabalhar a capacidade cardiorrespiratória
     *
     * @return frequência cardíaca de trabalho
     */
    public static float getIntesidadeTreinoCardio() {
        return INTENSIDADE_TREINO_CARDIO;
    }

    /**
     * Permite o cálculo da frequência cardíaca máxima
     *
     * @return calculo da frequência máxima
     */
    public float calcularFreqCardMax() {

        if ((atividade.equalsIgnoreCase("caminhada") || atividade.equalsIgnoreCase("corrida"))
                && (genero.equalsIgnoreCase("masculino") || genero.equalsIgnoreCase("feminino"))) {
            return (float) (208.75 - (0.73 * idade));
        } else if (this.atividade.equalsIgnoreCase("natação")) {
            return (float) (204 - (1.7 * idade));
        } else if (atividade.equalsIgnoreCase("ciclismo") && genero.toLowerCase().charAt(0) == 'm') {
            return (float) (202 - (0.72 * idade));
        } else if (atividade.equalsIgnoreCase("ciclismo") && genero.toLowerCase().charAt(0) == 'f') {
            return (float) (189 - (0.56 * idade));
        } else {
            return 0;
        }
    }

    /**
     * Devolve o nome, número de identificação civil, género, idade do atleta,
     * atividade associada, frequência cardíaca em repouso
     *
     * @return nome, número de identificação civil, género, idade do atleta,
     * atividade, freqCardRepouso
     */
    @Override
    public String toString() {
        return String.format("%nNome: %s%nNº Id. Civil: %d%nGénero: %s%nIdade: %d%nAtividade: %s%nFCR: %d%nValor Mensal Prémios: %.2f%n",
                nome, numIdCivil, genero, idade, atividade, freqCardRepouso, valorMensalPremios);
    }

    /**
     * Permite o cálculo da Frequência Cardíaca Trabalho queima de gordura
     *
     * @return Frequência Cardíaca Trabalho queima de gordura
     */
    public float calcularFreqCardTrabGordura() {
        return getFreqCardRepouso() + getIntesidadeTreinoCardio()
                * (calcularFreqCardMax() - getFreqCardRepouso());
    }

    /**
     * Permite o cálculo da Frequência Cardíaca Trabalho cardiorrespiratória
     *
     * @return Frequência Cardíaca Trabalho cardiorrespiratória
     */
    public float calcularFreqCardTrabCardio() {
        return getFreqCardRepouso() + getIntesidadeTreinoCardio()
                * (calcularFreqCardMax() - getFreqCardRepouso());
    }

    /**
     * Permite o cálculo do valor mensal que cada atleta recebe através de
     * polimorfismo
     *
     * @return cálculo do valor mensal
     */
    public abstract float calcularValorMensal();

    /**
     * Devolve o nome, frequência cardíaca máxima e frequência cardíaca de
     * trabalho (objetivo de queimar gordura e de trabalhar a capacidade
     * cardiorrespiratória)
     *
     * @return nome, calcularFreqCardTrabGordura, calcularFreqCardTrabCardio,
     * calcularFreqCardMAx
     */
    public String toStringLista1() {
        return String.format("Nome: %s%nFCM: %.2f%nFCT(gordura): %.2f%nFCT(cardio): %.2f%n",
                nome, calcularFreqCardMax(), calcularFreqCardTrabGordura(), calcularFreqCardTrabCardio());
    }

    /**
     * Devolve o nome e o valor mensal a pagar ao atleta
     *
     * @return nome, calcularValorMensal
     */
    public String toStringLista2() {
        return String.format("Nome: %s%nValor Mensal a Pagar: %.2f%n",
                nome, calcularValorMensal());
    }

    // ### TP2 ###
    /**
     * Compara alfabeticamente o nome do atleta e do outro recebido por
     * parâmetro
     *
     * @param outroAtleta atleta a ser compararado com o atleta inicial
     * @return 1 (o nome do atleta é maior que do outroAtleta), -1 (o nome do
     * atleta é menor que do outroAtleta) ou 0 (nome do atleta é igual ao do
     * outroAtleta)
     */
    @Override
    public int compareTo(Atleta outroAtleta) {
        return (this.getNome().trim().compareToIgnoreCase(outroAtleta.getNome()));
    }

    /**
     * Devolve o nome do atleta
     *
     * @return nome
     */
    public String toNomeIdadeAtividadeString() {
        return String.format("%nNome: %s%nIdade: %s%nAtividade: %s%n", nome, idade, atividade);
    }

    /**
     * Devolve o nome e o valor total mensal de prémios do atleta
     *
     * @return nome, valorMensalPremios
     */
    public String toNomePremioString() {
        return String.format("%nNome: %s%nValor Prémios: %.2f%n", nome, valorMensalPremios);
    }
    
    /**
     * Devolve o nome e a atividade do atleta
     *
     * @return nome, atividade
     */
    public String toNomeAtividadeString() {
        return String.format("%nNome: %s%nCategoria: %s%n", nome, atividade);
    }

}
