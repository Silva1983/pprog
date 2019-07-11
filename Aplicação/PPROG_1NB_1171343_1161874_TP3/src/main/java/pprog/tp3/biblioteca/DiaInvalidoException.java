package pprog.tp3.biblioteca;

/**
 *
 * @author João Pimentel (1161874)
 */
public class DiaInvalidoException extends IllegalArgumentException{

    public DiaInvalidoException() {
        super("Dia inválido!");
    }

    public DiaInvalidoException(String message) {
        super(message);
    }
}
