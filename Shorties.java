import java.util.Objects;

public class Shorties{
    private String name;
    private Clothes clothes;
    private Supplement subject;
    private Activities activity;

    public Shorties(String name){
        this.name = name;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void setSubject(Supplement subject) {
        this.subject = subject;
    }

    public void setActivity(Activities activity) {
        this.activity = activity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClothes() {
        return clothes.getClothes();
    }

    public String getSubject() {
        return subject.getName();
    }

    public String getActivity() {
        return activity.getFullActivity();
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
