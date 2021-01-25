package Constants;

public enum Area {
    BOTTOM("the bottom"), CEILING("the ceiling"), EDGE("the edge"), INITIAL("initial"),
    ULTIMATE("ultimate"), MIDDLE("the middle"), FAR_CORNERS("the far corners");

    private String area;

    private Area (String area){
        this.area = area;
    }

    public String getName(){
        return area;
    }
}
