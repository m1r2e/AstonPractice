package homework6.task1;

public class WrongLoginException extends  Exception{

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
