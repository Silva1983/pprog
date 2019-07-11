package pprog.tp3.ui.console;

import java.util.List;
import pprog.tp3.biblioteca.*;
import pprog.tp3.model.*;
import pprog.tp3.utils.*;

/**
 * Esta classe permite indicar a disponibilidade diária de prestação de serviços
 * (ator prestador de serviços).
 *
 * @author João (1161874)
 */
public class IndicarDisponibilidadeUI {

    public IndicarDisponibilidadeUI() {
    }
    
    public void run(List<Utilizador> utilizadores, int indexUtilizador) { // ou List<PrestadorServico>
        Disponibilidade newDisponibilidade = introduzDados();
        apresentaDados(newDisponibilidade);

        if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
            //teste
//            System.out.println(((PrestadorServico) utilizadores.get(indexUtilizador)));

            ((PrestadorServico) utilizadores.get(indexUtilizador)).addDisponibilidades(newDisponibilidade);
            //teste
            ListaForEach.listarDisponibilidades(((PrestadorServico) utilizadores.get(indexUtilizador)).getDisponibilidades());

            System.out.println("Registo efetuado com sucesso.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    private Disponibilidade introduzDados() {
        Data dInicio = new Data();
        Data dFim = new Data();
        Tempo tInicio = new Tempo();
        Tempo tFim = new Tempo();
        boolean dadosInvalidos = true;
        do {
            try {
                dInicio.setDia(Integer.parseInt(Utils.readLineFromConsole("Insira o dia de início do período")));
                dInicio.setMes(Integer.parseInt(Utils.readLineFromConsole("Insira o mês de início do período")));
                tInicio.setHoras(Integer.parseInt(Utils.readLineFromConsole("Insira a hora de início do período")));
                tInicio.setMinutos(Integer.parseInt(Utils.readLineFromConsole("Insira os minutos de início do período")));
                dFim.setDia(Integer.parseInt(Utils.readLineFromConsole("Insira o dia de fim do período")));
                dFim.setMes(Integer.parseInt(Utils.readLineFromConsole("Insira o mês de fim do período")));
                tFim.setHoras(Integer.parseInt(Utils.readLineFromConsole("Insira a hora de fim do período")));
                tFim.setMinutos(Integer.parseInt(Utils.readLineFromConsole("Insira os minutos de fim do período")));
                
                dadosInvalidos = false;
            } catch (DiaInvalidoException e) {
                System.out.println("Dia inválido!");
            } catch (MesInvalidoException e) {
                System.out.println("Mês inválido!");
            } catch (TempoInvalidoException e) {
                System.out.println("Tempo inválido!");
            } catch (NumberFormatException e) {
                System.out.println("Erro! Não é um valor inteiro!");
            }
        } while (dadosInvalidos);

        Disponibilidade disponibilidade = new Disponibilidade(dInicio, tInicio, dFim, tFim);
        return disponibilidade;
    }

    private void apresentaDados(Disponibilidade disponibilidade) {
        System.out.println("\n" + disponibilidade.toString());
    }
}
