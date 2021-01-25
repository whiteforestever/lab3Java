package Inanimate;

import Constants.Activities;

public class Entity extends Inanimate { // сущность

    private Activities activity;
    private Supplement subject;
    private Entity object;

    public Entity() {
        super();
    }

    public Entity(String name) {
        super(name);
    }

    public Entity(String name, String description) {
        super(name, description);
    }

    public void setObject(Entity object) {
        this.object = object;
    }

    public void setSubject(Supplement subject) {
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActivities(Activities activity){
        this.activity = activity;
    }

    public void getEntityWithActivity(){
        System.out.println(getInanimate() + " " + activity.getName());
    }

    public String getEntityWithObject(){
        return getInanimate() + " " + object.getName();
    }
    
}
