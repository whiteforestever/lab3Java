public enum ServiceWords {
    BY("by"), IN("in"), FROM("from"), UNDER("under"), DOWN("down"), NOT("not"),
    BUT("but"), AND("and"), THAT("that"), BELOW("below"), DONT("don't"), TO("to");

    private String word;

    private ServiceWords(String word){
        this.word = word;
    }

    public String getServiceWord(){
        return word;
    }
}
