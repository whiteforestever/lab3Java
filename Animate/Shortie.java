package Animate;

import java.util.Objects;

import Constants.Activities;
import Constants.Area;
import Constants.Clothes;
import Constants.CreatureClass;
import Constants.Effort;
import Constants.Mood;
import Constants.Speed;
import Exceptions.NegativeSupplements;
import Exceptions.VeryHeavy;
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
    private static int maxSupplements = 10;
    private Activities selfActivity;
    private String fullInfoAboutPlace; // например, для приложений, которые выводят подробную инфу о местоположении

    @Override
    public String getCreatureClass() {
        return creatureClass.getName();
    }

    public void addSupplement(Supplement subject) throws VeryHeavy{
        if (subjects.length >= maxSupplements) 
            throw new VeryHeavy ("Too many supplements for one shortie");
        Supplement[] temp = subjects.clone();
        subjects = new Supplement[subjects.length + 1];
        System.arraycopy(temp, 0, subjects, 0, temp.length);
        subjects[subjects.length - 1] = subject;
    }

    public static class HeavyMax { // static inner class for comparable supplements of two shorties
        public static Shortie getMaxSupplements(Shortie first, Shortie second){
            if (first.subjects.length >= second.subjects.length)
                return first;
            else
                return second;
        }
    }

    public void removeSupplement(Supplement subject){
        if (subjects.length == 0) 
            throw new NegativeSupplements("You can't remove, because you don't have supplements");
        for (int i = 0; i < subjects.length; ++i){
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

    public String seeAllSupplements(){
        System.out.print("Supplements of " + getName() + ": ");
        String s = "";
        for (int i = 0; i < subjects.length; ++i){
            if(i == subjects.length-1)
                s+= subjects[i].getName() + ".";
            else
                s+= subjects[i].getName() + ", ";
        }
        return s;
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

    public void getFullInfoAboutPlace(){
        System.out.println(fullInfoAboutPlace);
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

    public void seeSelfActivity() {
        System.out.println(getName() + " " + getSelfActivity());
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

    public void activityToAnimate(Activities activity1, LivingCreatures animate){
        System.out.println(this.name + " " + activity1.getName() + " to " + animate.getName());
    }

    public void activityToActivityWithDegreeOfEffort(Activities activity1, Activities activity2, Effort effort){
        System.out.println(this.name + " " + effort.getName() + " " + activity1.getName() + " to " + activity2.getName());
    }

    public void activityToActivityWithEntity(Activities activity1, Activities activity2, Entity entity){
        System.out.println(this.name + " " + activity1.getName() + " to " + activity2.getName() + " " + entity.getInanimate());
    }

    public void activityToActivityWithSupplement(Activities activity1, Activities activity2, Supplement supplement){
        System.out.println(this.name + " " + activity1.getName() + " to " + activity2.getName() + " " + supplement.getInanimate());
    }

    public void activityUsingSupplementForEntity(Activities activity, Supplement supplement, Entity entity){
        System.out.println(this.name + " " + activity.getName() + " " +  supplement.getName() + " for " + entity.getName());
    }

    public class CurrentPlace implements Place{
        private String nameOfPlace;
        private Area area;

        public String getName(){
            return nameOfPlace;
        }

        public void setArea(Area area){
            this.area = area;
        }

        public CurrentPlace(){
            this.nameOfPlace = "unknown";
            this.area = Area.UNKNOWN;
        }

        public CurrentPlace(String nameOfPlace){
            this.nameOfPlace = nameOfPlace;
            this.area = Area.UNKNOWN;
        }

        public CurrentPlace(String nameOfPlace, Area area){
            this.nameOfPlace = nameOfPlace;
            this.area = area;
        }

        public void setFullInfoAboutPlace(){
            fullInfoAboutPlace = Shortie.this.getName() + " in " + area.getName() + " of the " + this.getName();
        }
    }

    @Override
    public int hashCode(){
        // для каждого параметра Objects.hash() автоматически работает метод Objects.hashCode
        return Objects.hash(name, creatureClass, clothes, mood, selfActivity, subjects); 
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
        return Objects.equals(name, other.name) &&
        Objects.equals(creatureClass, other.creatureClass) &&
        Objects.equals(clothes, other.clothes) && 
        Objects.equals(mood, other.mood) &&
        Objects.equals(selfActivity, other.selfActivity) &&
        Objects.equals(subjects, other.subjects); 
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name= " + name + ", creature class= " + getCreatureClass() + 
        ", clothes= " + getClothes() + ", mood= " + getMood() +
        ", selfActivity= " + getSelfActivity() + ", subjects= " + seeAllSupplements() +"]";
    }
}
