public class Attempts extends Supplement implements ExtendActivity{
    private String name;
    
    public Attempts(String name, String description){
        super(description);
        this.name = name;
    }

    public String getPhrase(){
        return getDescription() + " " + name;
    }

    public String did(String act){
        return act;
    }

    public String statusDid(String act, String status){
        return act + " " + status; 
    }
}
