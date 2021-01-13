public class Fact extends Supplement implements Activity{
    private String name;
    
    public Fact(String name, String description){
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
