package lk.ijse.aadspringwebmvcassignment.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(){}
    public CustomerNotFoundException(String message) {
        super(message);
    }
    public CustomerNotFoundException(String message, Throwable cause) {}
}
