public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " and bonus - " + bonus;
    }

    @Override
    public void paySalary() {
        super.paySalary();
        System.out.printf("bonus %d %n", bonus);
    }

    public void setBonus(int value) {
        bonus = value;
    }
}
