public class VarietyOfPoses extends Supplement{
    
    private String description = "";

    public VarietyOfPoses(String description){
        super("variety of poses");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getVarietyOfPoses() {
        return this.getDescription() + " " + super.getName();
    }
}
