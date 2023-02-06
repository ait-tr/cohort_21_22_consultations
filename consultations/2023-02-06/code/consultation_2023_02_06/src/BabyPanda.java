import java.util.Objects;

public class BabyPanda implements Comparable<BabyPanda>{
    String name;
    int cutenessRate; // от 1 до 100

    boolean isVip;

    public BabyPanda(String name, int cutenessRate, boolean isVip) {
        this.name = name;
        this.cutenessRate = cutenessRate;
        this.isVip = isVip;
    }

    @Override
    public String toString() {
        return "BabyPanda{" +
                "name='" + name + '\'' +
                ", cutenessRate=" + cutenessRate +
                ", isVip=" + isVip +
                '}';
    }

    @Override
    public int compareTo(BabyPanda o) {
        if (this.isVip && !o.isVip){
            return -1;
        } else if (!this.isVip && o.isVip){
            return 1;
        } else {
            return -Integer.compare(this.cutenessRate, o.cutenessRate);
        }
    }

}
