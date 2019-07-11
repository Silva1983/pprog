package pprog.tp3.ui.console;

import java.io.IOException;
import pprog.tp3.model.Empresa;
import pprog.tp3.utils.Utils;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class AutenticacaoUI {

    private Empresa empresa;

    public AutenticacaoUI(Empresa empresa) {
        this.empresa = empresa;
    }

    public String run(Empresa empresa) {
        System.out.println("\n# Login/Autenticação #");
        String id;
        int maxTentativas = 3;
        boolean flag;
        do {
            maxTentativas--;
            id = Utils.readLineFromConsole("Introduza o Email: ");
            flag = empresa.checkUtilizadorByEmail(id);
            if (!flag) {
                System.out.println("Email errado ou inexistente.\nPossui mais " + maxTentativas + " tentativas.");
            }
        } while (!flag && maxTentativas > 0);
        return id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void logout(Empresa empresa) throws IOException {
        MenuUI uiMenu = new MenuUI();
        uiMenu.run(empresa);
    }
}
