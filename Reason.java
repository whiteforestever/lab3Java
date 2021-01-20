public class Reason extends Supplement{
    
    private String description = "";

    public Reason(String description){
        super("reason");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return super.getName() + " " + this.getDescription();
    }
}
