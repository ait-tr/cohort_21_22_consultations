package fruits;

public class Tree {
    // у дерева нет никакого массива -- нет никакого "ящика с готовыми апельсинами"\
    private String password = "друг";

    private boolean checkPassword(String password) {
        return password.equals(this.password);
    }

    // фабричный метод -- отдаёт новый экземпляр какого-то класса
    public Orange getOrange(String password) {
        if (!checkPassword(password)) {
            return null;
        }
        return getOrange();
    }

    private Orange getOrange() {
        return new Orange();
    }

    public Orange[] getOranges(String password, int amount) {
        if (!checkPassword(password)) {
            return null;
        }
        Orange[] result = new Orange[amount];
        for (int i = 0; i < amount; i++) {
            result[i] = getOrange();
        }
        return result;
    }
}
