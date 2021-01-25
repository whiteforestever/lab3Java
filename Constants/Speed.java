package Constants;

public enum Speed {
    LOW("low"), MEDIUM("medium"), FAST("fast");

    private String speed;

    private Speed(String speed){
        this.speed = speed;
    }

    public Speed getEffort(){
        return this;
    }

    public void setEffort(String speed){
        Speed m = (Speed) Enum.valueOf(Speed.class, speed);
        this.speed = m.getName();
    }

    public String getName(){
        return speed;
    }
}
