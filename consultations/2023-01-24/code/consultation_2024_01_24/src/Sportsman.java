import java.util.Objects;

public class Sportsman {
    public boolean isWarmedUP;
    public void warmUp(){
        isWarmedUP = true;
    }
    public void runTenMiles() throws SportsmanWarmUpException{
        if (isWarmedUP){
            System.out.println("Успешно завершил пробежку");
        } else {
            throw new SportsmanWarmUpException("Sportsman is not ready, because warmUp status is "+ isWarmedUP);
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Sportsman sportsman = (Sportsman) o;
//        return isWarmedUP == sportsman.isWarmedUP;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(isWarmedUP);
    }
}
