public class Device extends Supplement{
    
    private String description = "";
    private String status = "";

    public Device(String description, String status){
        super("device");
        this.description = description;
        this.status = status;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDevice() {
        return super.getName() + " " + this.getDescription() + " " + this.status;
    }
}
