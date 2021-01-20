public class Scale extends Supplement{
    
    private String description = "";

    public Scale(String description){
        super("scale");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return  this.getDescription() + " " + super.getName();
    }
}
