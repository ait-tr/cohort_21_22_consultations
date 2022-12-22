package fruits;

public class Storage {
    private Orange[] oranges = new Orange[10];
    private int orangeSize = 0;

    public boolean hasSpace() {
        return orangeSize < oranges.length;
    }

    // результат типа boolean и название, начинающееся на try, говорят, что дополнительные проверки
    // для вызова не нужны, но может потребоваться проверка результата
    public boolean tryAddOrange(Orange orange) {
        if (orange == null) { // проверка корректности входных данных
            System.out.println("Неправильный апельсин");
            return false;
        }
        if (!hasSpace()) {
//            return false; // не получилось добавить апельсин, нет места
            fruits.Orange[] newOranges = new fruits.Orange[oranges.length * 2]; // создаём новый массив
            for (int i = 0; i < oranges.length; i++) {
                newOranges[i] = oranges[i]; // скопировали всё из старого массива в новый
            }
            oranges = newOranges; // заменяем старый массив новым (в который уже всё скопировано)
        }
        oranges[orangeSize++] = orange;
        return true; // получилось добавить апельсин
    }

//    public boolean tryAddOrange(int weight) {
//        return tryAddOrange(new fruits.Orange(weight));
//    }
//
//    public boolean tryAddOrange() {
//        return tryAddOrange(new fruits.Orange());
//    }

    public void look() {
        for (Orange orange : oranges) {
            if (orange != null) {
                System.out.print(orange.getWeight() + " ");
            }
        }
        System.out.println();
    }
}
