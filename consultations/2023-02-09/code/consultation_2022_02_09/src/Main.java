public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(doSomethingGood("privet!"));
        Perfume jador = new Perfume("Dior Jador", 100);
        System.out.println(jador);
        System.out.println(doSomethingGood(jador));

        Perfume[] perfumes = new Perfume[]{jador, new Perfume("Dior", 50)};

        System.out.println(Printer.<Perfume>print(perfumes));

        System.out.println(Printer.<Decaf>methode2("Lavazza"));
        // Если в обобщенном методе нужно указать тип дженерика -
        // то при вызове указываем тип перед именем метода

        Printer.print(1);
        Printer.print(1.2);
        Printer.print2(5f);
        Printer.print2(new Decaf("String"));
        System.out.println("*".repeat(10));
        Printer.specialPrint(new Decaf("Decaf Lav"));
        Printer.<Double>specialPrint(9.0);

        Coffee d1 = new Decaf("Jardine");
        if (d1 instanceof Decaf) {
            Decaf d2 = (Decaf) d1;
            System.out.println(d2.getTitle());
        }
        System.out.println("*".repeat(15));
        System.out.println("*".repeat(15));

//        Tire michelene = new Tire("Michelene");
//        System.out.println(michelene);
//        Tire tire2 = (Tire) michelene.clone();

//        tire2.setTitle("Pirelli");
//
//        System.out.println(michelene);
//        System.out.println(tire2);

        System.out.println("*".repeat(15));
        System.out.println("*".repeat(15));

        //  глубокое копирование
        Tire tire3 = new Tire("Nokian", new Spike("Super spike"));
        Tire tire4 = tire3.clone();
        tire3.getSpike().setBrand("Duper spike");
        System.out.println(tire3);
        System.out.println(tire4);


    }

    public static <T> String doSomethingGood(T argument) {
        return argument.toString().toUpperCase();
    }

    public static <T> T doSomethingGood2(T argument) {
        return argument;
    }

    public static class Perfume {
        String title;
        double volume; // ml

        public Perfume(String title, double volume) {
            this.title = title;
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Perfume{" +
                    "title='" + title + '\'' +
                    ", volume=" + volume +
                    '}';
        }
    }
}