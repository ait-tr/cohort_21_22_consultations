public class Illness {
    private String title;
    public Illness(String title){
        this.title = title;
    }
    @Override
    public String toString(){
        return "\n\t" + title;
    }
}
