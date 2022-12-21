public class Main {
    public static void main(String[] args) {
        Hospital stAnnasHospital = new Hospital(
                new Sanitar[]{
                        new Sanitar("Denis", 200),
                        new Sanitar("Alexander", 400)
                },
                "St.Anna`s hospital"
        );
//        for(int i =0; i < stAnnasHospital.getSanitars().length; i++) {
//            stAnnasHospital.getSanitars()[i].getSalaryBonus();
//        }
        stAnnasHospital.giveBonusesToEveryone();
        System.out.println(stAnnasHospital.getSanitars()[0].getMoney());
        System.out.println(stAnnasHospital.getSanitars()[1].getMoney());

        System.out.println("________");
        Sanitar x1 = new Sanitar("John", 500);
        Sanitar x2 = x1;
        x2.setName("Johanna");
        System.out.println(x1.getName());
    }
}