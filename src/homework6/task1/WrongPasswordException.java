package homework6.task1;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){

    }

    public WrongPasswordException(String message){
        super(message);
    }
}
