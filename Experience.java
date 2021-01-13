public class Experience extends Supplement{
    private String name;
    
    public Experience(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return getDescription() + " " + name;
    }
}
