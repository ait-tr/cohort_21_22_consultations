public class Employee { // extends java.lang.Object
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }

    public void paySalary() {
        System.out.printf("%s get salary %d %n", name, salary);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int value) {
        salary = value;
    }
}
