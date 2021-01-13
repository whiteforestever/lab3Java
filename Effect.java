public class Effect extends Supplement{
    private String name;
    
    public Effect(String name, String description){
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
