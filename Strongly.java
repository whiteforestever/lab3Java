public class Strongly extends Supplement{
    
    private String description = "";

    public Strongly(){
        super("strongly");
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStrongly() {
        return super.getName() + this.getDescription();
    }
}
