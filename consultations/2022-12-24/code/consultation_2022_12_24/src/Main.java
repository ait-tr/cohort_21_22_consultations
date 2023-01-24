import java.util.ArrayList;
import java.util.Arrays;

public final class Main {
    public static void main(String[] args) {
        Illness cholera = new Illness("Cholera");  // холера
        Illness plague = new Illness("Plague");    // чума
        Illness anthrax = new Illness("Anthrax");  // сибирская язва
        Illness leprosy = new Illness("Leprosy"); // проказа
        Illness scabies = new Illness("Scabies");  // чесотка
        ArrayList<Illness> illnesses1 = new ArrayList<>(Arrays.asList(new Illness[]{cholera, plague, anthrax}));
        ArrayList<Illness> illnesses2 = new ArrayList<>(Arrays.asList(new Illness[]{cholera, anthrax, scabies}));
        Flea flea1 = new Flea(illnesses1);
        Flea flea2 = new Flea(illnesses2);
        Flea flea3 = new Flea();
        System.out.println(flea1);
        flea1.getIllnesses().add(leprosy);
        System.out.println(flea1);
        System.out.println(flea2);
        System.out.println(flea3);
        Ape homer = new Ape("Homer", new ArrayList<>(Arrays.asList(flea1, flea2, flea3)));
        Ape johnnyBanana = new Ape("Johnny Banana", new ArrayList<>(Arrays.asList(flea1, flea3)));
        System.out.println(homer);
        System.out.println(johnnyBanana);
        GroupOfApes kingsOfBerlin = new GroupOfApes("Berlin", new Ape[]{homer, johnnyBanana});
        System.out.println(kingsOfBerlin);
        // задание поменять болезнь leprocy у блохи джонни банана
        // распечатали
        System.out.println(
                kingsOfBerlin
                        .getApes()[1]
                        .getFleas()
                        .get(0)
                        .getIllnesses()
                        .get(3)

        );
        // а теперь заменим на другую болезнь
        Illness saveItForFuture =
                kingsOfBerlin
                        .getApes()[1]
                        .getFleas()
                        .get(0)
                        .getIllnesses()
                        .set(3, new Illness("Runny nose"));
        System.out.println("Удаленная болезнь: " + saveItForFuture);
        System.out.println(kingsOfBerlin);
    }


}