package Inanimate;

public abstract class Inanimate { // неодуш
    protected String name;
    protected String description;

    public Inanimate() {
        this.name = "unknown";
        this.description = "";
    }

    public Inanimate(String name) {
        this.name = name;
        this.description = "";
    }

    public Inanimate(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getInanimate() {
        if(description.equals(""))
            return name;
        else
            return description + " " + name;
    }
}
