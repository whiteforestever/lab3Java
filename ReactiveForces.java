public class ReactiveForces extends Supplement{
    
    private String description = "";

    public ReactiveForces(String description){
        super("reactive forces");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getReactiveForces() {
        return super.getName() + this.getDescription();
    }
}
