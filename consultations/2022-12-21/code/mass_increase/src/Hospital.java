public class Hospital {
    private Sanitar[] sanitars;
    private String title;

    public Sanitar[] getSanitars() {
        return sanitars;
    }

    public void giveBonusesToEveryone() {
        for (Sanitar sanitar : sanitars) {
            sanitar.getSalaryBonus();
        }
    }

    public Hospital(Sanitar[] sanitars, String title) {
        this.sanitars = sanitars;
        this.title = title;
    }
}
