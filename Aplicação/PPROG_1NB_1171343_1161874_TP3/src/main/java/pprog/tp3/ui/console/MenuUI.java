package pprog.tp3.ui.console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import pprog.tp3.model.Empresa;
import pprog.tp3.model.Utilizador;
import pprog.tp3.model.Utilizador.Tipo;
import pprog.tp3.utils.*;

/**
 *
 * @author paulomaio (editado)
 */
public class MenuUI {

    public MenuUI() {
        
    }

    public void run(Empresa empresa) throws IOException {
        List<String> options = new ArrayList<>();
        options.add("Login / Autenticação");
        options.add("Sair");
        int opcao;
        do {
            opcao = Utils.apresentaESelecionaIndex(options, "\n\n### MENU PRINCIPAL ###");
            switch (opcao) {
                case 1:
                    // teste
                    System.out.println(empresa.toString());
                    ListaForEach.listarUtilizadores(empresa.getUtilizadores());
                    // teste
                    AutenticacaoUI uiLogin = new AutenticacaoUI(empresa);
                    String email = uiLogin.run(empresa);
                    System.out.println(empresa.getUtilizadorByEmail(email));
                    redirecionaParaUI(empresa, email);
                    uiLogin.logout(empresa);
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        } while (opcao != -1);
    }

    private void redirecionaParaUI(Empresa empresa, String email) throws IOException {
        List<Utilizador> utilizadores = empresa.getUtilizadores();
        int indexUtilizador = empresa.getUtilizadorByEmail(email);
        Tipo tipo = utilizadores.get(empresa.getUtilizadorByEmail(email)).getTipo();
        switch (tipo) {
            case ADMINISTRATIVO:
                MenuAdministrativoUI adminUI = new MenuAdministrativoUI();
                adminUI.run(empresa);
                break;
            case CLIENTE:
                MenuClienteUI clienteUI = new MenuClienteUI();
                clienteUI.run(empresa, indexUtilizador);
                break;
            case PRESTADORSERVICO:
                MenuPrestadorServicoUI prestadorUI = new MenuPrestadorServicoUI();
                prestadorUI.run(utilizadores, indexUtilizador);
                break;
            default:
                throw new AssertionError();
        }
    }
}
