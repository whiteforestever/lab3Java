public class Happened extends Supplement{
    
    private String description = "";

    public Happened(){
        super.setName("happened");
    }

    public Happened(String description){
        super("happened");
        this.description = description;
    }


    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    public String getHappened() {
        return super.getName() + " " + this.getDescription();
    }
}
