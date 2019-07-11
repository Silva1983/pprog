package pprog.tp3.biblioteca;

/**
 *
 * @author João Pimentel (1161874)
 */
public class MesInvalidoException extends IllegalArgumentException{

    public MesInvalidoException() {
        super("Mês inválido!");
    }

    public MesInvalidoException(String message) {
        super(message);
    }
}
