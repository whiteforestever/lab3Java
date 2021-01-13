public class Helping extends Supplement{
    private String name;
    
    public Helping(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return getDescription() + " " + name;
    }

    public String did(String act){
        return act;
    }
}
