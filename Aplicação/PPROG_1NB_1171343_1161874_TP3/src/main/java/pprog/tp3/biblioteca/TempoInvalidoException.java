package pprog.tp3.biblioteca;

/**
 *
 * @author João Pimentel (1161874)
 */
public class TempoInvalidoException extends IllegalArgumentException{

    public TempoInvalidoException() {
        super("Tempo inválido!");
    }

    public TempoInvalidoException(String message) {
        super(message);
    }
}