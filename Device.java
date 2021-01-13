public class Device extends Supplement{
    private String name;
    
    public Device(String name, String description){
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
