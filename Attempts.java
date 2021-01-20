public class Attempts extends Supplement{
    
    private String description = "";

    public Attempts(String description){
        super("attempts");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttempts() {
        return super.getName() + " " + this.getDescription();
    }
}
