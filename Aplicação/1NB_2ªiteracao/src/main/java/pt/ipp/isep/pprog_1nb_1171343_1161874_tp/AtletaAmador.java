package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

/**
 * Representa um atleta amador através do seu nome, número ID civil, género,
 * idade, atividade, frequência cardíaca em repouso, valor mensal dos prémios
 * arrecadados e antiguidade no clube
 *
 * @author António (1171343) & João (1161874)
 */
public class AtletaAmador extends AtletaNaoProfissional {

    /**
     * Percentagem do valor mensal que cada jogador recebe
     */
    private float percentParcelaVariavelDois = 0.07f;
    /**
     * Cada jogador recebe pelo menos 5€
     */
    private float valorFixoParcelaVariavelDois = 5;
    /**
     * Contador de atletas amadores
     */
    private static int contadorAtletaAmador = 0;

    /**
     * Valor de premios por omissao
     */
    private final static int VALOR_PREMIOS_POR_OMISSAO = 0;

    /**
     * Inicia construtor do atleta amador por omissão
     */
    public AtletaAmador() {
        super();
        contadorAtletaAmador++;
    }

    /**
     * Inicializa o construtor atleta amador com o nome, número de identificação
     * civil, género, idade, atividade, frequência cardíaca em repouso,
     * antiguidade e valor por premios
     *
     * @param nome - nome do atleta
     * @param numIdCivil - número de identificação civil do atleta
     * @param genero - género do atleta
     * @param idade - idade do atleta
     * @param atividade - atividade do atleta
     * @param freqCardRepouso - frequência cardíaca em repouso do atleta
     * @param valorMensalPremios - valor mensal dos prémios arrecadados pelo
     * atleta
     * @param antiguidade - antiguidade no clube
     */
    public AtletaAmador(String nome, int numIdCivil, String genero, int idade, String atividade,
            int freqCardRepouso, float valorMensalPremios, int antiguidade) {
        super(nome, numIdCivil, genero, idade, atividade, freqCardRepouso, valorMensalPremios, antiguidade);
        contadorAtletaAmador++;
    }

    /**
     * Devolve percentagem do valor mensal que cada jogador recebe
     *
     * @return percentagem do valor mensal que cada jogador recebe
     */
    public float getPercentParcelaVariavelDois() {
        return percentParcelaVariavelDois;
    }

    /**
     * Modifica a percentagem do valor mensal que cada jogador recebe
     *
     * @param percentParcelaVariavelDois percentagem do valor mensal que cada
     * jogador recebe
     */
    public void setPercentParcelaVariavelDois(float percentParcelaVariavelDois) {
        this.percentParcelaVariavelDois = percentParcelaVariavelDois;
    }

    /**
     * Devolve valor mínimo que cada jogador recebe
     *
     * @return valor mínimo que cada jogador recebe
     */
    public float getValorParcelaVariavelDois() {
        return valorFixoParcelaVariavelDois;
    }

    /**
     * Modifica valor mínimo que cada jogador pode receber
     *
     * @param valorFixoParcelaVariavelDois valor mínimo que cada jogador pode
     * receber
     */
    public void setValorParcelaVariavelDois(float valorFixoParcelaVariavelDois) {
        this.valorFixoParcelaVariavelDois = valorFixoParcelaVariavelDois;
    }

    /**
     * Contador de atletas amadores
     *
     * @return quantidade de atletas amadores
     */
    public static int getContadorAtletaAmador() {
        return contadorAtletaAmador;
    }

    /**
     * Permite o cálculo do valor mensal que cada atleta recebe através de
     * polimorfismo
     *
     * @return cálculo do valor mensal
     */
    @Override
    public float calcularValorMensal() {

        return (getValorMensalPremios() * (super.getAntiguidade() >= 5 && super.getAntiguidade() <= 10
                ? AtletaNaoProfissional.getPercentAntiguidade510() : super.getAntiguidade() > 10 && super.getAntiguidade() <= 20
                ? AtletaNaoProfissional.getPercentAntiguidade1020() : super.getAntiguidade() > 20
                ? AtletaNaoProfissional.getPercentAntiguidade20() : 1)) + (this.getValorMensalPremios() * percentParcelaVariavelDois) + valorFixoParcelaVariavelDois;
    }

    /**
     * Devolve a descrição textual do atleta amador
     *
     * @return caraterísticas do atleta amador
     */
    @Override
    public String toString() {
        return String.format(super.toString());
    }

}
