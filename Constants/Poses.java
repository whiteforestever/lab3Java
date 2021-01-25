package Constants;

public enum Poses {
    BACKSTROKE("(backstroke"), BREASTSTROKE("breaststroke"), BUTTERFLY("butterfly"),
    CRAWL("crawl"), SIDESTROKE("sidestroke"), DIFFERENT("different");

    private String poses;

    private Poses(String poses){
        this.poses = poses;
    }

    public Poses getPoses(){
        return this;
    }

    public void setPoses(String poses){
        Poses m = (Poses) Enum.valueOf(Poses.class, poses);
        this.poses = m.getName();
    }

    public String getName(){
        return poses;
    }
}
