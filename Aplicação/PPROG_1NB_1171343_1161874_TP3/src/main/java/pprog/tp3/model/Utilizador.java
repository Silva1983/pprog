package pprog.tp3.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem todos os utilizadores da empresa.
 *
 * @author António (1171343) & João (1161874)
 */
public class Utilizador implements Serializable {

    /**
     * Tipos de papéis de utilizador
     */
    public static enum Tipo {
        ADMINISTRATIVO, CLIENTE, PRESTADORSERVICO;
    };

    private String nome;
    /**
     * Email do utilizador
     */
    private String email;

    /**
     * Tipo do utilizador
     */
    private Tipo tipo;

    /**
     * O nome por omissão do utilizador
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * O email por omissão do utilizador
     */
    private static final String EMAIL_POR_OMISSAO = "sem email";

    /**
     * O tipo por omissão do utilizador
     */
    private static final Tipo TIPO_POR_OMISSAO = Tipo.ADMINISTRATIVO;

    /**
     * Inicializa construtor do utilizador por omissão
     */
    public Utilizador() {
        nome = NOME_POR_OMISSAO;
        email = EMAIL_POR_OMISSAO;
        tipo = TIPO_POR_OMISSAO;
    }

    public Utilizador(String nome, String email, Tipo tipo) {
        if ((nome == null) || (email == null) || (nome.isEmpty()) || (email.isEmpty())) {
            throw new IllegalArgumentException("Nenhum dos argumentos pode ser nulo ou vazio.");
        }
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }

    /**
     * Devolve o nome do utilizador
     *
     * @return nome do utilizador
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Modifica o nome do utilizador
     *
     * @param nome o novo nome do utilizador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o email do utilizador
     *
     * @return email do utilizador
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Modifica o email do utilizador
     *
     * @param email o novo email do utilizador
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devolve o tipo do utilizador
     *
     * @return tipo
     */
    public Tipo getTipo() {
        return this.tipo;
    }

    /**
     * Modifica o tipo do utilizador
     *
     * @param tipo o novo tipo do utilizador
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean hasEmail(String email) {
        return this.getEmail().equalsIgnoreCase(email);
    }

    public List<Tipo> getPapeis() {
        List<Tipo> lista = new ArrayList<>();
        for (Tipo papeis : lista) {
            lista.add(papeis);
        }
        return lista;
    }

    //sobrou do HashSet do Utilizador de ESOFT
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.email);
        return hash;
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
        Utilizador obj = (Utilizador) o;
        return Objects.equals(email, obj.email);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nEmail: %s%nTipo do utilizador: %s%n", this.nome, this.email, this.tipo);
    }
    
    
    
}
