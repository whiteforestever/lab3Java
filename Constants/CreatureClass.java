package Constants;

public enum CreatureClass {
    HUMAN("human"), SHORTIE("shortie"), ANIMAL("animal"),
    PLANT("plant"), MUSHROOM("mushroom"), BACTERIUM("bacterium");

    private String creatureClass;

    private CreatureClass(String creatureClass){
        this.creatureClass = creatureClass;
    }

    public CreatureClass getCreatureClass(){
        return this;
    }

    public void setCreatureClass(String creatureClass){
        CreatureClass m = (CreatureClass) Enum.valueOf(CreatureClass.class, creatureClass);
        this.creatureClass = m.getName();
    }

    public String getName(){
        return creatureClass;
    }
}
