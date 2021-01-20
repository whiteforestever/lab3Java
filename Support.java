public class Support extends Supplement{
    
    private Supplement support;

    public Support(Supplement support){
        super("support");
        this.support = support;
    }
    
    public void setDescription(Supplement support) {
        this.support = support;
    }

    public String getSupport() {
        return super.getName() + " " + this.support.getName();
    }
}
