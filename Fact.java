public class Fact extends Supplement{
    
    private String description = "";
    private String status = "";

    public Fact(){
        super.setName("fact");
    }

    public Fact(String description){
        super("fact");
        this.description = description;
    }

    public Fact(String description, String status){
        super("fact");
        this.description = description;
        this.status = status;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFact() {
        return super.getName() + " " + this.getDescription() + " " + this.getStatus();
    }
}
