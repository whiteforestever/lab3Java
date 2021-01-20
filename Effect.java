public class Effect extends Supplement{
    
    private String description = "";

    public Effect(){
        super.setName("effect");
    }

    public Effect(String description){
        super("effect");
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    public String getEffect() {
        return super.getName() + " " + this.getDescription();
    }
}
