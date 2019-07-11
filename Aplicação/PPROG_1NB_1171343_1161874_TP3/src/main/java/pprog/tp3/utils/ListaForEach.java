package pprog.tp3.utils;

import java.util.List;
import pprog.tp3.model.Disponibilidade;
import pprog.tp3.model.PedidoPrestacaoServico;
import pprog.tp3.model.Utilizador;

/**
 *
 * @author João (1161874)
 */
public class ListaForEach {

    /**
     * Listagem com pedidos de prestação de serviços
     *
     * @param lista - ArrayList
     */
    public static void listarPedidos(List<PedidoPrestacaoServico> lista) {
        for (PedidoPrestacaoServico pedido : lista) {
            System.out.printf(pedido.toString());
        }
    }

    /**
     * Listagem com os utilizadores da empresa
     *
     * @param lista - ArrayList
     */
    public static void listarUtilizadores(List<Utilizador> lista) {
        for (Utilizador utilizador : lista) {
            System.out.printf(utilizador.toString());
        }
    }
    
    /**
     * Listagem com pedidos de prestação de serviços
     *
     * @param lista - ArrayList
     */
    public static void listarDisponibilidades(List<Disponibilidade> lista) {
        for (Disponibilidade disponibilidade : lista) {
            System.out.printf(disponibilidade.toString());
        }
    }
}
