package sigmfsdc.controladora.exceptions;

import java.util.logging.Logger;

public class PreexistingEntityException extends Exception {
    private static final Logger LOG = Logger.getLogger(PreexistingEntityException.class.getName());
    public PreexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException(String message) {
        super(message);
    }
}
