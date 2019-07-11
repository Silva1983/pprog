package pprog.tp3.model;

/**
 * Representa uma área geográfica através da sua designação, custo de deslocação
 * e código postal
 *
 * @author João (1161874)
 */
public class AreaGeografica {

    String designacao;
    float custoDeslocacao;
    String codigoPostal;

    /**
     * A designação por omissão
     */
    private static final String DESIGNACAO_POR_OMISSAO = "sem designação";

    /**
     * O custo de deslocação por omissão
     */
    private static final float CUSTODESLOCACAO_POR_OMISSAO = 0;

    /**
     * O código postal por omissão
     */
    private static final String CODIGOPOSTAL_POR_OMISSAO = "sem código postal";

    /**
     * Inicializa contrutor da Area Geografica por omissão
     */
    public AreaGeografica() {
        designacao = DESIGNACAO_POR_OMISSAO;
        custoDeslocacao = CUSTODESLOCACAO_POR_OMISSAO;
        codigoPostal = CODIGOPOSTAL_POR_OMISSAO;
    }

    /**
     * Inicializa construtor da área geográfica com a designação, custo de
     * deslocação e código postal
     *
     * @param designacao - designação da área geográfica
     * @param custoDeslocacao - custo deslocação
     * @param codigoPostal -código postal
     */
    public AreaGeografica(String designacao, float custoDeslocacao, String codigoPostal) {
        this.designacao = designacao;
        this.custoDeslocacao = custoDeslocacao;
        this.codigoPostal = codigoPostal;
    }

    /**
     * Devolve a Designação
     *
     * @return designação da área geográfica
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * Modifica a designação da área geográfica
     *
     * @param designacao nova designação
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * Devolve o custo da deslocação
     *
     * @return custo da deslocação
     */
    public float getCustoDeslocacao() {
        return custoDeslocacao;
    }

    /**
     * Modifica o custo da deslocação
     *
     * @param custoDeslocacao novo custo de deslocação
     */
    public void setCustoDeslocacao(float custoDeslocacao) {
        this.custoDeslocacao = custoDeslocacao;
    }

    /**
     * Devolve o código postal
     *
     * @return código postal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Modifica o código postal
     *
     * @param codigoPostal novo código postal
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
