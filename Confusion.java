public class Confusion extends Supplement{
    
    private String description = "";

    public Confusion(String description){
        super("confusion");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getConfusion() {
        return super.getName() + this.getDescription();
    }
}
