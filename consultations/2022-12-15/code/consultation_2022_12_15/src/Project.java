public abstract class Project {
    private String title;
    protected double budget;

    public String getTitle(){
        return title;
    }
    public abstract void calculatePrice();

    public void info(){
        System.out.println(title);
    }

    public void specialInfo(){
        info();
    }

    public Project(String title, double budget){
        this(title); // обращаемся к конструктору с одним параметром
        this.budget = budget;
    }
    // method overloading
    public Project(String title){
        this.title = title;
    }
    public Project(){
        System.out.println("Конструктор базового класса");
    }
}
