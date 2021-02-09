package Place;

import Animate.LivingCreatures;
import Constants.Area;
import Inanimate.Supplement;

public class Cave implements Place {
    String name = "Cave";
    String area;
    Supplement[] subjects; // предметы внутри пещеры
    LivingCreatures[] livingCreatures;

    public void setSubjects(Supplement[] subjects){
        this.subjects = new Supplement[subjects.length];
        System.arraycopy(subjects, 0, this.subjects, 0, subjects.length);
    }

    public void setLivingCreatures(LivingCreatures[] livingCreatures){
        this.livingCreatures = new LivingCreatures[livingCreatures.length];
        System.arraycopy(livingCreatures, 0, this.livingCreatures, 0, livingCreatures.length);
    }

    public void getSubjects(){
        System.out.print("Supplements in " + getName() + ": ");
        for (int i = 0; i < subjects.length; ++i){
            if(i == subjects.length-1)
                System.out.println(subjects[i].getName() + ".");
            else
                System.out.print(subjects[i].getName() + ", ");
        }
    }

    public void getLivingCreatures(){
        System.out.print("Living creatures in " + getName() + ": ");
        for (int i = 0; i < livingCreatures.length; ++i){
            if(i == livingCreatures.length-1)
                System.out.println(livingCreatures[i].getName() + ".");
            else
                System.out.print(livingCreatures[i].getName() + ", ");
        }
    }

    public Cave(Area area){
        this.area = area.getName();
    }

    public void setArea(Area area){
        this.area = area.getName();
    }

    public String getName(){
        return this.area + " of " + this.name; 
    }

    //добавить людей
}
