public class GroupOfApes {
    private String arial;
    private Ape[] apes;

    public Ape[] getApes(){
        return apes;
    }

    public GroupOfApes(String arial, Ape[] apes) {
        this.arial = arial;
        this.apes = apes;
    }
    @Override
    public String toString() {
        String apesStr = "";
        for (Ape ape : apes) {
            apesStr +=" " + ape;
        }
        return String.format("Monkey group from %s %s", arial, apesStr);
    }

}
