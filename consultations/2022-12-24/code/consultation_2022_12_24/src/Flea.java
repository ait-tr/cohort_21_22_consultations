import java.util.ArrayList;

public class Flea {
    private ArrayList<Illness> illnesses;


    public Flea(ArrayList<Illness> illnesses) {
        this.illnesses = illnesses;
    }
    public Flea(){}
    public ArrayList<Illness> getIllnesses(){
        return illnesses;
    }

    @Override
    public String toString(){
        String ilnessesStr = "";
        if (illnesses == null){
            return "  Absolutely healthy flea";
        }
        for (Illness illness : illnesses) {
            ilnessesStr += " " + illness;
        }
        return "  Flea with illnesses:" + ilnessesStr;
    }

}
