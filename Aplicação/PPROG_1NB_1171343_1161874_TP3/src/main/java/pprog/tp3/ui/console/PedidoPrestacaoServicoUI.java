package pprog.tp3.ui.console;

import pprog.tp3.model.*;
import pprog.tp3.utils.Utils;
import pprog.tp3.biblioteca.*;
import pprog.tp3.utils.ListaForEach;

/**
 *
 * @author João (1161874)
 */
public class PedidoPrestacaoServicoUI {

  
    public PedidoPrestacaoServicoUI() {
    }
    
    public void run(Empresa empresa, int indexUtilizador) {
        PedidoPrestacaoServico newPedido = introduzDados(((Cliente) empresa.getUtilizadores().get(indexUtilizador)));
        apresentaDados(newPedido);

        if (Utils.confirma("Confirma os dados introduzidos? (S/N)")) {
            //teste
//            System.out.println(((Cliente) empresa.getUtilizadores().get(indexUtilizador)));

            empresa.addPedidoPrestacaoServico(newPedido);
            //teste
            ListaForEach.listarPedidos(empresa.getPedidosPrestacaoServico());

            System.out.println("Registo efetuado com sucesso.");
        } else {
            System.out.println("Operação cancelada.");
        }
    }
    

    private PedidoPrestacaoServico introduzDados(Cliente cliente) {
        Data dataPreferencia = new Data();
        Tempo tempoPreferencia = new Tempo();
        Tempo duracao = new Tempo();
        String descricao = "sem descricao";
        boolean dadosInvalidos = true;
        do {
            try {
                descricao = Utils.readLineFromConsole("Insira a descrição do pedido");
                dataPreferencia.setDia(Integer.parseInt(Utils.readLineFromConsole("Insira o dia pretendido")));
                dataPreferencia.setMes(Integer.parseInt(Utils.readLineFromConsole("Insira o mês pretendido")));
                tempoPreferencia.setHoras(Integer.parseInt(Utils.readLineFromConsole("Insira a hora de início do pedido")));
                tempoPreferencia.setMinutos(Integer.parseInt(Utils.readLineFromConsole("Insira os minutos do pedido")));
                System.out.println("Insira o tempo de duração do serviço pretendido...");
                duracao.setHoras(Integer.parseInt(Utils.readLineFromConsole("Quantas horas?")));
                duracao.setMinutos(Integer.parseInt(Utils.readLineFromConsole("Quantos minutos?")));
                
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

        PedidoPrestacaoServico pedido = new PedidoPrestacaoServico(cliente, dataPreferencia, tempoPreferencia, duracao, descricao);
        return pedido;
    }
    
    private void apresentaDados(PedidoPrestacaoServico pedido) {
        System.out.println("\n" + pedido.toString());
    }
}
