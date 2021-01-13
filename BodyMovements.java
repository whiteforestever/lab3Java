public class BodyMovements extends Supplement{
    private String name;
    
    public BodyMovements(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return getDescription() + " " + name;
    }
}
