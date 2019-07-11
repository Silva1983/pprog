package pprog.tp3.ui;

import pprog.tp3.model.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import pprog.tp3.ui.console.MenuUI;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Empresa empresa = new Empresa();
        Properties props = getProperties();
        empresa.setDesignacao(props.getProperty("Empresa.Designacao"));
        empresa.setNif(props.getProperty("Empresa.NIF"));
        bootstrap(props, empresa);
        MenuUI uiMenu = new MenuUI();
        uiMenu.run(empresa);
    }

    public static Properties getProperties() {
        Properties props = new Properties();
        // Adiciona propriedades e valores por omissão
        props.setProperty("Empresa.Designacao", "Default Lda.");
        props.setProperty("Empresa.NIF", "Default NIF");
        // Lê as propriedades e valores definidas 
        try {
            InputStream in = new FileInputStream("config.properties");
            try {
                props.load(in);
            } finally {
                in.close();
            }
        } catch (IOException e) {
            System.out.println("Não foi possível ler o ficheiro de configuração" + e.getMessage());
        }
        return props;
    }

    public static void bootstrap(Properties props, Empresa empresa) {
        
        empresa.addUtilizador(new Cliente(props.getProperty("Cliente1.nome"), props.getProperty("Cliente1.email"), props.getProperty("Cliente1.nif"), props.getProperty("Cliente1.telefone"), new EnderecoPostal(props.getProperty("Cliente1.local"), props.getProperty("Cliente1.codigoPostal"), props.getProperty("Cliente1.localidade"))));
        empresa.addUtilizador(new Cliente(props.getProperty("Cliente2.nome"), props.getProperty("Cliente2.email"), props.getProperty("Cliente2.nif"), props.getProperty("Cliente2.telefone"), new EnderecoPostal(props.getProperty("Cliente2.local"), props.getProperty("Cliente2.codigoPostal"), props.getProperty("Cliente2.localidade"))));
        empresa.addUtilizador(new Cliente(props.getProperty("Cliente3.nome"), props.getProperty("Cliente3.email"), props.getProperty("Cliente3.nif"), props.getProperty("Cliente3.telefone"), new EnderecoPostal(props.getProperty("Cliente3.local"), props.getProperty("Cliente3.codigoPostal"), props.getProperty("Cliente3.localidade"))));
        empresa.addUtilizador(new Cliente(props.getProperty("Cliente4.nome"), props.getProperty("Cliente4.email"), props.getProperty("Cliente4.nif"), props.getProperty("Cliente4.telefone"), new EnderecoPostal(props.getProperty("Cliente4.local"), props.getProperty("Cliente4.codigoPostal"), props.getProperty("Cliente4.localidade"))));

        empresa.addUtilizador(new Administrativo(props.getProperty("Administrativo1.nome"), props.getProperty("Administrativo1.email")));
        empresa.addUtilizador(new Administrativo(props.getProperty("Administrativo2.nome"), props.getProperty("Administrativo2.email")));

        empresa.addUtilizador(new PrestadorServico(props.getProperty("PrestadorServico1.nomeCompleto"), props.getProperty("PrestadorServico1.email"), props.getProperty("PrestadorServico1.nif"), props.getProperty("PrestadorServico1.telefone"), props.getProperty("PrestadorServico1.nomeAbreviado")));
        empresa.addUtilizador(new PrestadorServico(props.getProperty("PrestadorServico2.nomeCompleto"), props.getProperty("PrestadorServico2.email"), props.getProperty("PrestadorServico2.nif"), props.getProperty("PrestadorServico2.telefone"), props.getProperty("PrestadorServico2.nomeAbreviado")));
        empresa.addUtilizador(new PrestadorServico(props.getProperty("PrestadorServico3.nomeCompleto"), props.getProperty("PrestadorServico3.email"), props.getProperty("PrestadorServico3.nif"), props.getProperty("PrestadorServico3.telefone"), props.getProperty("PrestadorServico3.nomeAbreviado")));
        empresa.addUtilizador(new PrestadorServico(props.getProperty("PrestadorServico4.nomeCompleto"), props.getProperty("PrestadorServico4.email"), props.getProperty("PrestadorServico4.nif"), props.getProperty("PrestadorServico4.telefone"), props.getProperty("PrestadorServico4.nomeAbreviado")));

        empresa.addServico(new Servico(props.getProperty("Servicos1.strId"), props.getProperty("Servicos1.strDescricaoBreve"), props.getProperty("Servicos1.strDescricaoCompleta"), Double.parseDouble(props.getProperty("Servicos1.dCustoHora")), new Categoria(props.getProperty("Categoria1.strCodigo"), (props.getProperty("Categoria1.m_strDescricao")))));
        empresa.addServico(new Servico(props.getProperty("Servicos2.strId"), props.getProperty("Servicos2.strDescricaoBreve"), props.getProperty("Servicos2.strDescricaoCompleta"), Double.parseDouble(props.getProperty("Servicos2.dCustoHora")), new Categoria(props.getProperty("Categoria2.strCodigo"), (props.getProperty("Categoria2.m_strDescricao")))));
        empresa.addServico(new Servico(props.getProperty("Servicos3.strId"), props.getProperty("Servicos3.strDescricaoBreve"), props.getProperty("Servicos3.strDescricaoCompleta"), Double.parseDouble(props.getProperty("Servicos3.dCustoHora")), new Categoria(props.getProperty("Categoria2.strCodigo"), (props.getProperty("Categoria2.m_strDescricao")))));
        empresa.addServico(new Servico(props.getProperty("Servicos4.strId"), props.getProperty("Servicos4.strDescricaoBreve"), props.getProperty("Servicos4.strDescricaoCompleta"), Double.parseDouble(props.getProperty("Servicos4.dCustoHora")), new Categoria(props.getProperty("Categoria3.strCodigo"), (props.getProperty("Categoria3.m_strDescricao")))));
    }
}
