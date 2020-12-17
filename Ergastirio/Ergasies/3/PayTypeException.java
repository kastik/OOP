public class PayTypeException extends Exception{
    private String message;
    PayTypeException(String message){
        super(message);
    }
}
