public class Experience extends Supplement{
    
    private String description = "";

    public Experience(String description){
        super("experience");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return super.getName() + " " + this.getDescription();
    }
}
