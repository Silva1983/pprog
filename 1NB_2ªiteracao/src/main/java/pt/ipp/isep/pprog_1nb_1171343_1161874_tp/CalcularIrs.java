package pt.ipp.isep.pprog_1nb_1171343_1161874_tp;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public interface CalcularIrs {

    /**
     * Taxa imutável de IRS (default = public static final)
     */
    float TAXA_IRS = .1f;

    /**
     * Permite calcular o valor do IRS
     *
     * @return valor do IRS a descontar
     */
    public abstract float calcularIrs();

}
