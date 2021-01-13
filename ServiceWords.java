public enum ServiceWords {
    BY("by"), IN("in"), FROM("from"), UNDER("under"), DOWN("down"),
    BUT("but"), AND("and"), THAT("that"), BELOW("below");

    private String word;

    private ServiceWords(String word){
        this.word = word;
    }

    public String getServiceWord(){
        return word;
    }
}
