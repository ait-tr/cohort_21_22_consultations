public class PlasticWaste extends Waste {
    String marking;

    public PlasticWaste() {
        System.out.println("Вызывается конструктор производного класса");
    }

    public String toString() {
        return String.format(
                "Plastic marking: %s volume: %f weight: %f isRecyclable %b",
                marking,
                super.getVolume(),
                super.getWeight(),
                super.getIsRecyclable()
        );
    }
}
