package productservicepro.exception;

public class CartNotFoundException extends RuntimeException{
    public CartNotFoundException(String message) {
        super(message);
    }
}
