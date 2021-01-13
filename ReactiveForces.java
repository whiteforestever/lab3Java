public class ReactiveForces extends Supplement{
    private String name;
    
    public ReactiveForces(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return name + " " + getDescription();
    }
}
