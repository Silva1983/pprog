package pprog.tp3.model;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem utilizadores que não são funcionários da empresa.
 *
 * @author António (1171343) & João (1161874)
 */
public abstract class UtilizadorNaoFuncionario extends Utilizador {

    private String nif;
    private String telefone;

    private static final String NIF_POR_OMISSAO = "sem NIF";
    private static final String TELEFONE_POR_OMISSAO = "sem telefone";

    /**
     * Inicializa o construtor do utilizador não funcionário
     */
    public UtilizadorNaoFuncionario() {
        super();
        nif = NIF_POR_OMISSAO;
        telefone = TELEFONE_POR_OMISSAO;
    }

    public UtilizadorNaoFuncionario(String nome, String email, Tipo tipo, String nif, String telefone) {
        super(nome, email, tipo);
        if ((nif == null) || (telefone == null) || (nome.isEmpty()) || (email.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos não pode ser nulo ou vazio.");
        }
        this.nif = nif;
        this.telefone = telefone;
    }

    /**
     * Devolve o NIF do utilizador não funcionário
     *
     * @return nif do utilizador não funcionário
     */
    public String getNif() {
        return nif;
    }

    /**
     * Modifica o NIF do utilizador não funcionário
     *
     * @param nif do utilizador não funcionário
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Devolve número telefone
     * 
     * @return número telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Modifica número telefone
     * 
     * @param telefone - número telefone
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }    

    /**
     * Devolve a descrição textual do utilizador não funcionário da empresa
     *
     * @return caraterísticas do utilizador não funcionário
     */
    @Override
    public String toString() {
        return String.format(super.toString() + "NIF: %s%nTelefone: %s%n", nif, telefone);
    }
}
