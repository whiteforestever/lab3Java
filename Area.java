public enum Area {
    BOTTOM("the bottom"), CEILING("the ceiling"), 
    FAR_CORNERS("the far corners");
   
    private String area;

    private Area (String area){
        this.area = area;
    }

    public String getArea(){
        return area;
    }
}
