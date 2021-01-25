package Place;

import Constants.Area;
import Inanimate.Supplement;

public class Cave implements Place {
    String name = "Cave";
    String area;
    Supplement[] subjects; // предметы внутри пещеры

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
