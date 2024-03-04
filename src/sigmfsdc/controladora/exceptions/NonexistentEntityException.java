package sigmfsdc.controladora.exceptions;

import java.util.logging.Logger;

public class NonexistentEntityException extends Exception {
    private static final Logger LOG = Logger.getLogger(NonexistentEntityException.class.getName());
    public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public NonexistentEntityException(String message) {
        super(message);
    }
}
