package Constants;

public enum Effort {
    NONSTRESSED("non-stressed"), MEDIUM("medium"), WITHALLMIGHT("with all might"),
    ALLGOOD("as if nothing had happened");

    private String effort;

    private Effort(String effort){
        this.effort = effort;
    }

    public Effort getEffort(){
        return this;
    }

    public void setEffort(String effort){
        Effort m = (Effort) Enum.valueOf(Effort.class, effort);
        this.effort = m.getName();
    }

    public String getName(){
        return effort;
    }
}
