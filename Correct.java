public class Correct extends Supplement{
    
    private String description = "";

    public Correct(){
        super("correct");
    }

    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCorrect() {
        return super.getName() + this.getDescription();
    }
}
