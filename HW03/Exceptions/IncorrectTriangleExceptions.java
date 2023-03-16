package HW03.Exceptions;

public class IncorrectTriangleExceptions extends Exception {
    public IncorrectTriangleExceptions() {
    }

    public IncorrectTriangleExceptions(String message) {
        super(message);
    }

    public IncorrectTriangleExceptions(Throwable cause) {
        super(cause);
    }

    public IncorrectTriangleExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectTriangleExceptions(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
