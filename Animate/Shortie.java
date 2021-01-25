package Animate;

import java.util.Objects;

import Constants.Activities;
import Constants.Clothes;
import Constants.CreatureClass;
import Constants.Effort;
import Constants.Mood;
import Constants.Speed;
import Inanimate.Entity;
import Inanimate.Inanimate;
import Inanimate.Supplement;
import Place.Place;

public class Shortie extends LivingCreatures{
    private String name;
    private CreatureClass creatureClass = CreatureClass.SHORTIE;
    private Mood mood;
    private Clothes clothes;
    private Supplement[] subjects = new Supplement[0];
    private Activities selfActivity;


    @Override
    public String getCreatureClass() {
        return creatureClass.getName();
    }

    public void addSupplement(Supplement subject){
        Supplement[] temp = subjects.clone();
        subjects = new Supplement[subjects.length + 1];
        System.arraycopy(temp, 0, subjects, 0, temp.length);
        subjects[subjects.length - 1] = subject;
    }

    public void removeSupplement(Supplement subject){
        for (int i = 0; i < subjects.length; ++i){
            if (subjects.length == 0)
                break;
            if(subjects[i].getName().equals(subject.getName())){
                Supplement[] temp = new Supplement[subjects.length - 1];
                System.arraycopy(subjects, 0, temp, 0, i);
                System.arraycopy(subjects, i+1, temp, i, subjects.length - i - 1);
                subjects = new Supplement[temp.length];
                System.arraycopy(temp, 0, subjects, 0, temp.length);
                break;
            }
        }
    }

    public void seeAllSupplements(){
        System.out.print("Supplements of " + getName() + ": ");
        for (int i = 0; i < subjects.length; ++i){
            if(i == subjects.length-1)
                System.out.println(subjects[i].getName() + ".");
            else
                System.out.print(subjects[i].getName() + ", ");
        }
    }

    public Supplement reachSupplement(Supplement supplement){
        for (int i = 0; i < subjects.length; ++i){
            if (subjects.length == 0)
                return null;
            if(subjects[i].getName().equals(supplement.getName())){
                return subjects[i];
            }
        }
        return null;
    }

    public Shortie(String name){
        this.name = name;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void setSubjects(Supplement[] subjects) {
        this.subjects = subjects;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void setSelfActivity(Activities selfActivity) {
        this.selfActivity = selfActivity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getClothes() {
        return "dressed in " + clothes.getName();
    }

    public String getClothesName(){
        return clothes.getName();
    }

    public String getSelfActivity() {
        return selfActivity.getName();
    }

    public Mood getMood() {
        return mood;
    }

    public Supplement[] getSubjects() {
        return subjects;
    }

    public void activityWithInanimate(Activities activity, Inanimate inanimate){
        System.out.println(this.name + " " + activity.getName() + " " +  inanimate.getName());
    }

    public void activityOfEntity(Activities activity, Entity entity){
        System.out.println(this.name + " " + activity.getName() + " of " +  entity.getEntityWithObject());
    }

    public void activitySupplement(Activities activity, Supplement supplement){
        System.out.println(this.name + " " + activity.getName() + " " + supplement.getSupplement());
    }

    public void activityOnEntityWithSupplement(Activities activity, Entity entity, Supplement supplement){
        System.out.println(this.name + " " + activity.getName() + " " +  entity.getName() + " by " + supplement.getName());
    }

    public void activityWithDegreeOfEffort(Activities activity, Effort effort){
        System.out.println(this.name + " " + activity.getName() + " " +  effort.getName());
    }

    public void activityWithDegreeOfSpeed(Activities activity, Speed speed){
        System.out.println(this.name + " " + activity.getName() + " " +  speed.getName());
    }

    public void activityWithGoal(Activities activity, String goal){
        System.out.println(this.name + " " + activity.getName() + " to " +  goal);
    }

    public void activityWithExactPlace(Activities activity, Place place){
        System.out.println(this.name + " " + activity.getName() + " in " +  place.getName());
    }

    public void activityWithExactPlaceWithSpeed(Activities activity, Speed speed, Place place){
        System.out.println(this.name + " " + activity.getName() + " " + speed.getName() + " in " + place.getName());
    }

    public void activityToActivity(Activities activity1, Activities activity2){
        System.out.println(this.name + " " + activity1.getName() + " to " + activity2.getName());
    }

    public void activityToActivityWithDegreeOfEffort(Activities activity1, Activities activity2, Effort effort){
        System.out.println(this.name + " " + effort.getName() + " " + activity1.getName() + " to " + activity2.getName());
    }

    public void activityToActivityWithEntity(Activities activity1, Activities activity2, Entity entity){
        System.out.println(this.name + " " + activity1.getName() + " to " + activity2.getName() + " " + entity.getInanimate());
    }

    public void activityUsingSupplementForEntity(Activities activity, Supplement supplement, Entity entity){
        System.out.println(this.name + " " + activity.getName() + " " +  supplement.getName() + " for " + entity.getName());
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
        Shortie other = (Shortie) otherObject;
        return Objects.equals(name, other.name); 
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + "]";
    }

}
