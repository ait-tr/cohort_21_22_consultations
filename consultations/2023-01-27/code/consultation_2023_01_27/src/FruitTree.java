import java.util.ArrayList;
import java.util.Objects;

public class FruitTree<T extends Fruit & Eatable, K extends Soil> {
    private int age;
    private double height;
    private T fruit;

    private K typeOfSoil;

    public FruitTree(int age, double height, T fruit, K soil) {
        this.age = age;
        this.height = height;
        this.fruit = fruit;
        this.typeOfSoil = soil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitTree<?, ?> fruitTree = (FruitTree<?, ?>) o;
        return age == fruitTree.age && Double.compare(fruitTree.height, height) == 0 && Objects.equals(fruit, fruitTree.fruit) && Objects.equals(typeOfSoil, fruitTree.typeOfSoil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, fruit, typeOfSoil);
    }
}
