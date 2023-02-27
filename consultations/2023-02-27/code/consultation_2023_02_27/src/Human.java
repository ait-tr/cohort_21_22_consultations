public class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void live() {
        new Heart().say();
        new Stomach().say();
    }

    private class Heart {
        public void say() {
            System.out.println("tudum-tudum");
        }
    }

    private class Stomach {
        public void say() {
            System.out.println("bul`-bul`");
        }
    }
}
