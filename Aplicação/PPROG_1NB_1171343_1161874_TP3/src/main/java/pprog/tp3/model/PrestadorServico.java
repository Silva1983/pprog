package pprog.tp3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class PrestadorServico extends UtilizadorNaoFuncionario {

    String nomeAbreviado;

    private List<Servico> servicos;
    private List<AreaGeografica> areasGeograficas;
    private List<Disponibilidade> disponibilidades;

    /**
     * O tipo de utilizador
     */
    private static final Tipo TIPO = Tipo.PRESTADORSERVICO;

    /**
     * O nome por omissão do utilizador
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * O nome abreviado por omissão do prestador
     */
    private static final String NOMEABREVIADO_POR_OMISSAO = "sem nome";

    /**
     * Inicializa construtor do prestador por omissão
     */
    public PrestadorServico() {
        super();
        nomeAbreviado = NOMEABREVIADO_POR_OMISSAO;
        servicos = new ArrayList<>();
        areasGeograficas = new ArrayList<>();
        disponibilidades = new ArrayList<>();
    }

    /**
     * Inicializa o construtor prestador de serviço com o nome, email, nif e
     * telefone
     *
     * @param nomeCompleto
     * @param email
     * @param nif
     * @param telefone
     * @param nomeAbreviado
     */
    public PrestadorServico(String nomeCompleto, String email, String nif, String telefone, String nomeAbreviado) {
        super(nomeCompleto, email, TIPO, nif, telefone);
        this.nomeAbreviado = nomeAbreviado;
        this.servicos = new ArrayList<>();
        this.areasGeograficas = new ArrayList<>();
        this.disponibilidades = new ArrayList<>();
    }

    /**
     * Devolve uma lista de serviços do prestador
     *
     * @return lista de serviços do prestador
     */
    public ArrayList<Servico> getServicos() {
        return new ArrayList<>(servicos);
    }

    /**
     * Insere uma nova lista de serviços
     *
     * @param novaListaServicos
     */
    public void setServicos(List<Servico> novaListaServicos) {
        servicos = new ArrayList<>(novaListaServicos);
    }

    /**
     * Devolve uma lista das áreas geográficas de atuação do prestador
     *
     * @return lista de serviços do prestador
     */
    public ArrayList<AreaGeografica> getAreasGeograficas() {
        return new ArrayList<>(areasGeograficas);
    }

    /**
     * Insere uma nova lista de áreas geográficas de atuação do prestador
     *
     * @param novaListaAreasGeograficas
     */
    public void setAreasGeograficas(List<AreaGeografica> novaListaAreasGeograficas) {
        areasGeograficas = new ArrayList<>(novaListaAreasGeograficas);
    }

    /**
     * Devolve uma lista com as disponibilidades do prestador
     *
     * @return lista de disponibilidades do prestador
     */
    public ArrayList<Disponibilidade> getDisponibilidades() {
        return new ArrayList<>(disponibilidades);
    }

    /**
     * Insere uma nova lista com as disponibilidades do prestador
     *
     * @param novaListaDisponibilidades
     */
    public void setDisponibilidades(List<Disponibilidade> novaListaDisponibilidades) {
        disponibilidades = new ArrayList<>(novaListaDisponibilidades);
    }

    /**
     * Insere uma nova disponibilidade do prestador
     *
     * @param novaDisponibilidade
     */
    public void addDisponibilidades(Disponibilidade novaDisponibilidade) {
        disponibilidades.add(novaDisponibilidade);
    }

//    @Override
    public boolean equals(Utilizador o) {
        // Inspirado em https://www.sitepoint.com/implement-javas-equals-method-correctly/

        // self check
        if (this == o) {
            return true;
        }
        // null check
        if (o == null) {
            return false;
        }
        // type check and cast
        if (getClass() != o.getClass()) {
            return false;
        }
        // field comparison
        PrestadorServico obj = (PrestadorServico) o;
        return (Objects.equals(getEmail(), obj.getEmail()));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.getEmail());
        return hash;
    }

    @Override
    public String toString() {
        String str = String.format(super.toString() + "Nome abreviado: %s%n", nomeAbreviado);
        for (Servico servico : servicos) {
            str += "\nServiço(s):\n" + servico;
        }
        for (AreaGeografica areaGeografica : areasGeograficas) {
            str += "\nZona(s) geográfica(s) de atuação:\n" + areaGeografica;
        }
        for (Disponibilidade disponibilidade : disponibilidades) {
            str += "\nDisponibilidade:\n" + disponibilidade;
        }
        return str;
    }
}
