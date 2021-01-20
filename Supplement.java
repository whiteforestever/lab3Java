public abstract class Supplement{
    private String name;

    public Supplement(){
        this.name = "unknown";
    }

    public Supplement(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
