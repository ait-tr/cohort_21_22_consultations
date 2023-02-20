public class Composer implements Comparable<Composer> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Composer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Composer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Composer o) {
        if (age == o.age){
            return name.compareTo(o.name);
        }
        return Integer.compare(this.age, o.age);
    }
}
