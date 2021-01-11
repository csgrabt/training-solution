package exceptionclass.course;

public class InvalidTimeException extends RuntimeException{

    public String message;


    public InvalidTimeException(String message) {
        super(message);
    }



}
