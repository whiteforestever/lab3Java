public class Thing extends Supplement{
    
    private String description = "";

    public Thing(String name, String description){
        super(name);
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
