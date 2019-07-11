package pprog.tp3.ui.console;

import java.util.ArrayList;
import java.util.List;
import pprog.tp3.model.Utilizador;
import pprog.tp3.utils.Utils;

/**
 *
 * @author João (1161874)
 */
public class MenuPrestadorServicoUI {

    public MenuPrestadorServicoUI() {
    }

    public void run(List<Utilizador> utilizadores, int indexUtilizador) {
        List<String> options = new ArrayList<>();
        options.add("Indicar disponibilidade diária de prestação de serviços");
        options.add("Sair");
        int opcao;
        
        do {
            opcao = Utils.apresentaESelecionaIndex(options, "\n\n### MENU PRESTADOR DE SERVIÇOS ###");

            switch (opcao) {
                case 1:
                    IndicarDisponibilidadeUI uiIndDisp = new IndicarDisponibilidadeUI();
                    uiIndDisp.run(utilizadores, indexUtilizador);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while (opcao != -1);
    }
}
