public class Bicycle {
    Pedal pedal; // null

    public Bicycle() {
    }

    public Bicycle(String pedalBrand) {
        this.pedal = new Pedal(pedalBrand);
    }

    public void showPedalsBrand() {
        pedal.advert();
    }

    private class Pedal {
        String brand;

        public Pedal(String brand) {
            this.brand = brand;
        }

        public void advert() {
            System.out.println(brand + " - это лучший бренд на свете");
            new BicycleTools().help();
        }
    }

    private static class BicycleTools {
        private void help() {
            System.out.println("Круто педали, пока не дали");
        }
    }

    ;
}
