package Inanimate;

import Constants.Activities;

public class Entity extends Inanimate { // сущность

    private Activities activity;
    private Supplement subject;
    private Entity object;

    public Entity() {
        super.name = "unknown";
        super.description = "unknown";
    }

    public Entity(String name) {
        super.name = name;
        super.description = "unknown";
    }

    public Entity(String name, String description) {
        super.name = name;
        super.description = description;
    }

    public void setObject(Entity object) {
        this.object = object;
    }

    public void setSubject(Supplement subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setDescription(String description) {
        super.description = description;
    }

    public void setActivities(Activities activity){
        this.activity = activity;
    }

    public void getEntityWithActivity(){
        System.out.println(super.description + " " + super.name + " " + activity.getName());
    }

    public String getEntityWithObject(){
        return super.description + " " + super.name + " " + object.getName();
    }
    
}
