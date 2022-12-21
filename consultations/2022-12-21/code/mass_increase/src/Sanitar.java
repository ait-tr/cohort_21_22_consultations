public class Sanitar {
    private String name;
    private double money;

    public void getSalaryBonus() {
        money += 50;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {

        return money;
    }

    public Sanitar(String name, double money) {
        this.name = name;
        this.money = money;
    }
}
