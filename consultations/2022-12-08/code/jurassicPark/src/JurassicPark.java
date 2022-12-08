public class JurassicPark {
    private String title;
    private double space;
    private Dinosaur[] dinosaurs;

    public Dinosaur[] getDinosaurs() {
        return dinosaurs;
    }

    public JurassicPark(String title, double space, Dinosaur[] dinosaurs) {
        this.title = title;
        this.space = space;
        this.dinosaurs = dinosaurs;
    }

    @Override
    public String toString() {
        String accumulator = ""; // в эту переменную мы соберем всех динозавров из массива
        for(int i = 0; i < dinosaurs.length; i++){
            accumulator = accumulator + dinosaurs[i];
        }
        return String.format("Title: %s,\n space: %f\n dinasaurs:\n%s", title, space, accumulator); // %s - String; %d - int; %b - boolean; %f - с точкой;
    }
}
