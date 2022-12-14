public class OrganicWaste extends Waste {
    private int timeOfDecomposition; // время за которое разлагается

    public String toString() {
        return String.format(
                "Organic decomposition: %s days, volume: %f weight: %f isRecyclable %b",
                timeOfDecomposition,
                super.getVolume(),
                super.getWeight(),
                super.getIsRecyclable()
        );
    }

    public OrganicWaste() {
    }

    public OrganicWaste(double weight, double volume, boolean isRecyclable, int timeOfDecomposition) {
        super(weight, volume, isRecyclable);
        this.timeOfDecomposition = timeOfDecomposition;
    }


}
