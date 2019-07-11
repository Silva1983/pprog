package pprog.tp3.model;

import java.util.Objects;

/**
 *
 * @author António (1171343) & João (1161874)
 */
public class Cliente extends UtilizadorNaoFuncionario {

    /**
     * morada do cliente
     */
    private EnderecoPostal morada;

    /**
     * Tipo cliente
     */
    private static final Tipo TIPO = Tipo.CLIENTE;

    /**
     * Inicializa construtor Cliente por omissao
     */
    public Cliente() {
        super();
        morada = new EnderecoPostal();
    }

    /**
     * Inicializa construtor Cliente com nome, email, nif, telefone e morada
     * 
     * @param nome - nome cliente
     * @param email - email do cliente
     * @param nif - nif do cliente
     * @param telefone - telefone cliente
     * @param morada  - morada cliente
     */
    public Cliente(String nome, String email, String nif, String telefone, EnderecoPostal morada) {
        super(nome, email, TIPO, nif, telefone);
        this.morada = morada;
    }

    /**
     * Devolve a morada do cliente
     *
     * @return morada do cliente
     */
    public EnderecoPostal getMorada() {
        return morada;
    }

    /**
     * Insere uma nova morada do cliente
     *
     * @param morada
     */
    public void setMoradas(EnderecoPostal morada) {
        this.morada = morada;
    }

    @Override
    public boolean equals(Object o) {
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
        Cliente obj = (Cliente) o;
        return (Objects.equals(getEmail(), obj.getEmail()) || Objects.equals(getNif(), obj.getTelefone()));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.getEmail());
        hash = 79 * hash + Objects.hashCode(this.getNif());
        return hash;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Morada: %s%n", morada);
    }

    public static EnderecoPostal novoEnderecoPostal(String strLocal, String strCodPostal, String strLocalidade) {
        return new EnderecoPostal(strLocal, strCodPostal, strLocalidade);
    }

}
