package Constants;

public enum Clothes {
    HugeSpaceSuit("a huge space suit"), TSHIRT("a t-shirt"), SHIRT("a shirt"),
    TURTLENECK("a turtleneck"), JEANS("jeans"), PANTS("pants"),
    SNEAKERS("sneakers"), SHOES("shoes"), GLASSES("glasses");

    private String clothes;

    private Clothes(String clothes){
        this.clothes = clothes;
    }

    public Clothes getClothes(){
        return this;
    }

    public void setClothes(String clothes){
        Clothes m = (Clothes) Enum.valueOf(Clothes.class, clothes);
        this.clothes = m.getName();
    }

    public String getName(){
        return clothes;
    }
}
