package lesson.Exceptions;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super();
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArrayDataException(Throwable cause) {
        super(cause);
    }

    protected MyArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
