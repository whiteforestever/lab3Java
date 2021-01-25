package Constants;

public enum Mood {
    WONDERFUL("wonderful"), MEDIUM("medium"), BAD("bad"),
    SHOCKED("shocked"), UPSET("upset"), INSPIRED("inspired");

    private String mood;

    private Mood(String mood){
        this.mood = mood;
    }

    public Mood getMood(){
        return this;
    }

    public void setMood(String mood){
        Mood m = (Mood) Enum.valueOf(Mood.class, mood);
        this.mood = m.getName();
    }

    public String getName(){
        return mood;
    }
}
