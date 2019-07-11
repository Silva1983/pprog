package pprog.tp3.ui.console;

import pprog.tp3.model.AtribuicaoPedido;
import pprog.tp3.model.Empresa;
import pprog.tp3.utils.Utils;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class AtribuirPedidoUI {

    public AtribuirPedidoUI() {
    }

    public void run(Empresa empresa) {
        System.out.println("\n# Atribuir pedido de prestação de serviço a um prestador de serviços #");

        if (introduzDados()) {
            apresentaDados();

            if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
//                if (novoAtribuirPedido.registaAtribuicao()) {
//                    System.out.println("Registo efetuado com sucesso.");
//                } else {
//                    System.out.println("Não foi possivel concluir o registo com sucesso.");
//                }
            }
        } else {
            System.out.println("Ocorreu um erro. Operação cancelada.");
            MenuUI uiMenu = new MenuUI();
//            uiMenu.run();
        }
    }

    private boolean introduzDados() {
//        ListaForEach.listarPedidos(empresa.getPedidosPrestacaoServico());

        String strNumPedido = Utils.readLineFromConsole("Insira um número do pedido de prestação de serviços: ");
//        correr método para encontrar os prestadores daquele serviço disponíveis para aquele horário
//        ListaForEach.listarPrestadoresDisponiveis(ArrayList com os prestadores disponíveis);

        String strPrestador = Utils.readLineFromConsole("Insira o prestador de serviços a atribuir ao pedido: ");
//        novoAtribuirPedido.registar(Cliente x, PrestadorServico y)
        return true;
    }

    private void apresentaDados() {
//        System.out.println("\nCategoria:\n" + novoAtribuirPedido.getAtribuicaoString());
    }
}
