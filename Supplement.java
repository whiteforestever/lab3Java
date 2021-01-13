public abstract class Supplement {
    private String description;

    public Supplement(){
        description = "";
    }

    public Supplement(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public abstract String getPhrase();
}
