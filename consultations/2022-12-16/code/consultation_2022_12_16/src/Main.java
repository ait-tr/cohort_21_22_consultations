import java.util.Arrays;

public class Main {
    // Вопросы:
    // - решение задач
    //   - codewars.com - для начинающих и опытных (мало сложной математики и алгоритмов)
    //   - leetcode.com - для гениальных начинающих и опытных (много математики и алгоритмов)

    // - массивы
    //   - перебор
    //   - сортировка

    // дано 10 чисел
    // вывести из них только чётные и в порядке возрастания
    // как придумывать решение:
    // - представить ситуацию без компьютера - набор реальных предметов
    //   - бочонки домино
    //   - бумажки с числами,
    //   - мешочки с чем-нибудь
    //   -> 3 7 10 8 6 4 5 1 9 2
    // - придумать, как вы бы её решали руками и головой
    //   - перебрать по одному, отобрать чётные
    //   -> получился ряд из чётных бочонков
    //   -> 10 8 6 4 2
    //   - отсортировать (расставить по порядку)
    // - реализовать то же самое, но как программу
    public static int[] getSortedEvenNumbers(int[] numbers) {
        // - перебрать по одному, отобрать чётные
        int evenCounter = 0; // счётчик чётных чисел
        for (int x : numbers) { // перебираем бочонки
            if (x % 2 == 0) { // если номер на бочонке чётный
                evenCounter++; // загибаем палец -- увеличиваем счётчик
            }
        }

        int[] evenNumbers = new int[evenCounter]; // чтобы положить в такой массив, нужно знать, куда
        // уже есть индексы от 0 до (evenCounter - 1)
        int newElementIndex = 0; // сначала положим число в элемент с индексом 0
        // for (типЭлемента временнаяПеременная : наборЭлементов) {
        // for (int i = 0; i < numbers.length; i++) { // можно так, тогда вместо x будет numbers[i]
        for (int x : numbers) { // перебираем бочонки
            if (x % 2 == 0) { // если номер на бочонке чётный -- x разделится на 2 без остатка
                // evenNumbers[0] = x
                // evenNumbers[1] = x
                // evenNumbers[2] = x
                // evenNumbers[3] = x
                // evenNumbers[4] = x
                evenNumbers[newElementIndex] = x; // запоминаем его в evenNumbers
                newElementIndex++; // в следующий раз положим число в элемент со следующим индекс
            }
        }

        Arrays.sort(evenNumbers); // после этого числа в evenNumbers будут отсортированы по возрастанию
        return evenNumbers;
    }

    // - наследование
    //   - extends
    //   - abstract
    //   - super
    // представим, что нам нужно написать программу для игры в шахматы друг с другом

    // нам нужен класс "Игровая доска"
    // Она (доска) будет основным классом и будет проверять, можно ли (по правилам) сделать ход
    // - проверяет координаты клеток
    // - проверяет, не мешают ли другие фигуры
    // - содержит в себе фигуры (списком), удаляем срубленные фигуры

    // Нам нужен класс "Фигура"
    // - атрибут "цвет"
    // - может быть, координаты на доске -- это плохо, лучше, если фигура не зависит от доски
    // - метод для проверки координат -- может ли именно эта фигура попасть из одной точки в другую
    //   (без учёта других фигур), будем передавать начальную и конечную клетки

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int i = 0; // то же самое, что и цикл for выше
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }
    }
}