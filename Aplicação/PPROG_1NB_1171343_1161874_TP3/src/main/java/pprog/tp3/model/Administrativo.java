package pprog.tp3.model;

import java.util.Objects;

/**
 *
 * @author João (1161874)
 */
public class Administrativo extends Utilizador {
    
    private static final Tipo TIPO = Tipo.ADMINISTRATIVO;

    public Administrativo() {
        super();
    }

    public Administrativo(String nome, String email) {
        super(nome, email, TIPO);
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
        Administrativo obj = (Administrativo) o;
        return (Objects.equals(getEmail(), obj.getEmail()));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.getEmail());
        return hash;
    }
}
