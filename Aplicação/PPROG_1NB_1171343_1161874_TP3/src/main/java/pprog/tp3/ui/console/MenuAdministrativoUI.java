package pprog.tp3.ui.console;

import java.util.ArrayList;
import java.util.List;
import pprog.tp3.utils.Utils;
import java.io.IOException;
import pprog.tp3.model.Empresa;
/**
 *
 * @author António (1171343) & João (1161874)
 */
public class MenuAdministrativoUI {

    public MenuAdministrativoUI() {
    }

    public void run(Empresa empresa) throws IOException{
        List<String> options = new ArrayList<>();
        options.add("Atribuir pedido de prestação de serviço a um prestador de serviços");
        options.add("Sair");
        int opcao;

        do {
            opcao = Utils.apresentaESelecionaIndex(options, "\n\n### MENU ADMINISTRATIVO ###");

            switch (opcao) {
                case 1:
                    AtribuirPedidoUI uiAtrPed = new AtribuirPedidoUI();
                    uiAtrPed.run(empresa);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while (opcao != -1);
    }
}
