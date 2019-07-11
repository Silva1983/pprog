package pprog.tp3.model;

import java.util.List;

/**
 * Esta classe permite atribuir um prestador de serviço a um serviço solicitado
 * por um cliente, tendo em consideração o cumprimento de certos critérios (ator
 * administrativo).
 *
 * @author António (1171343) & João (1161874)
 */
public class AtribuicaoPedido implements CriteriosAtribuicaoPedido {

    private Empresa m_oEmpresa;
    private AtribuicaoPedido pedido;
    private List<String> pedidos;

    /**
     * Permite calcular a distância entre pontos definidos pelas suas
     * coordenadas
     *
     * @return distância entre pontos definidos pelas suas coordenadas
     */
    @Override
    public double criterioDistancia() {
        
        return 0;
    }

    /**
     * Permite verificar a existência de compatibilidade entre o horário de
     * disponibilidade do prestador e o horário indicado pelo cliente para a
     * realização do serviço.
     *
     * @return true (disponibilidade coincidente) ou false (disponibilidade não
     * coincidente)
     */
    @Override
    public boolean criterioDisponibilidade() {
//        CalculoDistancia
        return true;
    }

    /**
     * Regista a atribuição do pedido
     */
    public void registaAtribuicao() {
//        this.m_oEmpresa.addPedidosPrestacaoServico(pedidoPrestacaoServico);
    }

    /**
     * Obtém String com a atribuição de pedido
     *
     * @return pedido
     */
    public String getAtribuicaoString() {
        return this.pedido.toString();
    }
}
