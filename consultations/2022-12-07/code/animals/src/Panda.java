public class Panda {
    private double weight;
    private int age;
    private boolean isMale;
    private String name = "Shusha";
    private Toy[] toys;
    private boolean isInGoodMood;

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public Toy[] getToys() {
        return toys;
    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
    }

    public void smokeBamboo() {
        isInGoodMood = true;
    }

    public Panda() {
    }

    public Panda(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Panda(double weight, int age, boolean isMale, String name, Toy[] toys, boolean isInGoodMood) {
        this.weight = weight;
        this.age = age;
        this.isMale = isMale;
        this.name = name;
        this.toys = toys;
        this.isInGoodMood = isInGoodMood;
    }

    public String toString() {
        String allToys = "";
        for (int i = 0; i < toys.length; i++) {
            if (i == toys.length-1) {
                allToys= allToys + toys[i] + ".";
            } else {
                allToys= allToys + toys[i] + ", ";
            }
        }
        return "Panda " + name + " is " + age + " years old. Favourite toys are: " + allToys;
    }
}