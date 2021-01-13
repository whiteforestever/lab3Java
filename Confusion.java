public class Confusion extends Supplement{
    private String name;
    
    public Confusion(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return getDescription() + " " + name;
    }
}
