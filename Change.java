public class Change extends Supplement{
    private String name;
    private String place;
    
    public Change(String name, String description, String place){
        super(description);
        this.name = name;
        this.place = place;
    }

    public String getPhrase(){
        return getDescription() + " " + name + " " + place;
    }
}
