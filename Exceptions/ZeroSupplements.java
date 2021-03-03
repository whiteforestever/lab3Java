package Exceptions;

public class ZeroSupplements extends RuntimeException {
    
    public ZeroSupplements(){}
    public ZeroSupplements(String  gripe){
        super(gripe);
    }
    
}