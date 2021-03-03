package Inanimate;

public class Supplement extends Inanimate{ // предмет

    public int length;

	public Supplement() {
        super.name = "unknown";
        super.description = "unknown";
    }

    public Supplement(String name) {
        super.name = name;
        super.description = "unknown";
    }

    public Supplement(String name, String description) {
        super.name = name;
        super.description = description;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void setDescription(String description) {
        super.description = description;
    }

    public String getSupplement(){
        return super.description + " " + super.name;
    }

    public void moreDescriptionForSupplement(String moreDescription){
        class VeryDescriptionable{ // локальный класс
            // нужен тогда, когда появляется необходимость расширенного описания
            private String extraDescription = description + " " + moreDescription;
            
            void getMoreDescriptionable(){
                System.out.println(extraDescription + " " + name);
            }
        }
        VeryDescriptionable extraDescription = new VeryDescriptionable();
        extraDescription.getMoreDescriptionable();
    }

	
}