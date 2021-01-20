public class Moment extends Supplement{
    
    private String description = "";

    public Moment(String description){
        super("in one moment");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMoment() {
        return super.getName() + " " + this.getDescription();
    }
}
