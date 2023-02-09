public class Tire implements Cloneable {
    private String title;
    private Spike spike;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Spike getSpike() {
        return spike;
    }

    public void setSpike(Spike spike) {
        this.spike = spike;
    }

    public Tire(String title, Spike spike) {
        this.title = title;
        this.spike = spike;
    }

    public Tire(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "title='" + title + '\'' +
                ", spike=" + spike +
                '}';
    }

    @Override
    protected Tire clone() throws CloneNotSupportedException {
        Tire newTire = (Tire) super.clone();
        Spike newSpike = spike.clone();
        newTire.setSpike(newSpike);
        return newTire;
    }
}
