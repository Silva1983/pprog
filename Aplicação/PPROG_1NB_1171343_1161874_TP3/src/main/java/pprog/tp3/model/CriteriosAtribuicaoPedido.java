package pprog.tp3.model;

/**
 * Esta classe permite implementar os critérios para atribuir um pedido de
 * prestação de serviços
 *
 * @author António (1171343) & João (1161874)
 */
public interface CriteriosAtribuicaoPedido {

    /**
     * Permite calcular a distância entre pontos definidos pelas suas
     * coordenadas
     *
     * @return distância entre pontos definidos pelas suas coordenadas
     */
    public double criterioDistancia();

    /**
     * Permite verificar a existência de compatibilidade entre o horário de
     * disponibilidade do prestador e o horário indicado pelo cliente para a
     * realização do serviço.
     *
     * @return true (disponibilidade coincidente) ou false (disponibilidade não
     * coincidente)
     */
    public boolean criterioDisponibilidade();

}
