package pprog.tp3.ui.console;

import java.util.ArrayList;
import java.util.List;
import pprog.tp3.model.Empresa;
import pprog.tp3.utils.Utils;

/**
 *
 * @author João (1161874)
 */
public class MenuClienteUI {

    public MenuClienteUI() {
    }

    public void run(Empresa empresa, int indexUtilizador) {
        List<String> options = new ArrayList<>();
        options.add("Efetuar Pedido de Prestação de Serviços");
        options.add("Sair");
        int opcao;

        do {
            opcao = Utils.apresentaESelecionaIndex(options, "\n\n### MENU CLIENTE ###");

            switch (opcao) {
                case 1:
                    PedidoPrestacaoServicoUI uiPedPrest = new PedidoPrestacaoServicoUI();
                    uiPedPrest.run(empresa, indexUtilizador);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while (opcao != -1);
    }
}
