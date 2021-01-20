public class BodyMovements extends Supplement{
    
    private String description = "";

    public BodyMovements(String description){
        super("bodymovements");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBodyMovements() {
        return super.getName() + this.getDescription();
    }
}
