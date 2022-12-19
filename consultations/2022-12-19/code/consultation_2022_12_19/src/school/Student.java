package school;

public class Student {
    private String name;
    private int marksSize = 0; // количество поставленных оценок -- оно же индекс новой оценки
    // если marksSize == 5, то у нас уже есть пять оценок
    // в массиве marks заполнены элементы с индексами 0, 1, 2, 3, 4
    // первый свободный элемент -- с индексом 5, индекс первого свободного элемента СОВПАДАЕТ
    // с количеством уже поставленных оценок
    private int[] marks = new int[10];
    private Group group;

    protected Student(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public void rate(int mark) { // поставить оценку
        // добавляем оценку в marks
        if (marksSize == marks.length) {
            int[] newMarks = new int[marks.length * 2]; // новый массив оценок, в два раза больше старого
            for (int i = 0; i < marksSize; i++) {
                newMarks[i] = marks[i]; // копируем оценки из старых - marks - в новые - newMarks
            }
            marks = newMarks; // ссылка marks теперь ведёт на newMarks, на новый массив оценок,
            // старый нам больше не нужен
        }
        marks[marksSize] = mark; // используем количество поставленных оценок как индекс первого свободного элемента
        marksSize++; // мы поставили новую оценку, увеличиваем количество поставленных оценок
    }

    public double getAverage() { // получить средний балл
        if (marksSize == 0) {
            return 0.0;
        }
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marksSize;
    }

    @Override
    public String toString() {
        return group.getName() + ": " + name + ": " + getAverage();
    }
}
