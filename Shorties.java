import java.util.Objects;

public class Shorties implements ExtendActivity{
    private String name = "Shorties";
    private final static String clothes = "bulky spacesuits";

    public String getClothes(){
        return clothes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String did(String act){
        return act;
    }

    public String statusDid(String act, String status){
        return status + " " + act; 
    }

    @Override
    public int hashCode(){
        // для каждого параметра Objects.hash() автоматически работает метод Objects.hashCode
        return Objects.hash(name); 
    }
    
    @Override
    public boolean equals(Object otherObject){
        // быстро проверить объекты на идентичность 
        if (this == otherObject) return true;

        // если новый объект null, то сразу false
        if(otherObject == null) return false;

        // если классы не совпадают, то сразу false
        if(getClass() != otherObject.getClass()) return false;

        // проверка на равенство полей, так как известно, что otherObject != null
        Shorties other = (Shorties) otherObject;
        return Objects.equals(name, other.name); 
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + "]";
    }

}
