public class Change extends Supplement{
    
    private String description = "";

    public Change(String description){
        super("change");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getChange() {
        return super.getName() + this.getDescription();
    }
}
