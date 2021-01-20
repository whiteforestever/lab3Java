public class Cave implements Place{
    String name = "Cave";
    String area;

    public void setArea(Area area){
        this.area = area.getArea();
    }

    public String getPlace(){
        return this.area + " of " + this.name; 
    }
}
