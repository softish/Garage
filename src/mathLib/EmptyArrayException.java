package mathLib;

/**
 * Created by softish on 2016-06-15.
 */
public class EmptyArrayException extends RuntimeException {
    public EmptyArrayException() {
    }

    public EmptyArrayException(String message) {
        super(message);
    }
}
