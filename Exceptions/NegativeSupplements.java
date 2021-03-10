package Exceptions;

public class NegativeSupplements extends RuntimeException {
    
    public NegativeSupplements(){}
    public NegativeSupplements(String  gripe){
        super(gripe);
    }
    
}