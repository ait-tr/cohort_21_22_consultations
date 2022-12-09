public class Frog {
    private boolean toxic;
    private double weight = 3;

    public boolean getToxic() {
        return toxic;
    }

    public double getWeight() {
        return weight;
    }

    public void setToxic(boolean toxic) {
        this.toxic = toxic;
    }

    @Override
    public String toString() {
        return "Frog " + (toxic ? "toxic" : "edible") +
                ", " + weight;
    }
}
