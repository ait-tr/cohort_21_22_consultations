public class Main {
    // вопросы:

    public static void main(String[] args) {
        // - наследование
        Manager manager = new Manager("Cyrus", 100000, 20000);
        System.out.println(manager); // Manager.toString, потому что переопределён
        manager.setSalary(150000); // Employee.setSalary, потому что не переопределён
        System.out.println(manager);
        manager.setBonus(30000); // Manager.setBonus, потому что его и нет у Employee
        System.out.println(manager);

        // - for-each
        System.out.println("------------");
        Employee[] workers = new Employee[3];
        workers[0] = new Manager("Cyrus", 100000, 20000);
        workers[1] = new Employee("Daniel", 15000);
        workers[2] = new Employee("Dennis", 16000);
        for (int i = 0; i < workers.length; i++) {
            // использую индекс в теле цикла
            // - для условия (только элементы с чётными индексами, например)
            // - для сохранения
            // - для вывода
            System.out.println((i + 1) + ". " + workers[i]);
        }

        System.out.println("------------");
        // for (ТипЭлемента временнаяПеременная : коллекция) {
        for (Employee element : workers) { // нужно указать тип элемента
            // не использую индекс в теле цикла, просто перебираю всё
            System.out.println(element);
        }

        System.out.println("------------");
        // может быть условие, связанное с элементом, а не с его индексом
        for (Employee element : workers) { // нужно указать тип элемента
            // не использую индекс в теле цикла, просто перебираю всё
            if (element.getSalary() < 50000) {
                System.out.println(element);
            }
            if (element.getSalary() > 90000) {
                continue; // завершить шаг цикла досрочно и перейти к следующему шагу
            }
            element.paySalary();
        }

        // - двумерные массивы -- что спрашивают?
        // int[][] matrix = new int[5][5];
        //      v - какой здесь тип?
        // for (type row : matrix) {
        //     ...
        // }
        // чем new ArrayList<int[]> отличается от new int[5][5]?
        // -- дополнительный материал -- стек и куча

        // - ООП -- что спрашивают?
        // - инкапсуляция, полиморфизм, наследование
        // - конкретные примеры наследования

        // - выдать n простых чисел
        // - решето Эратосфена
        System.out.println("------------");
        for (int x : plainNumbers(20)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] plainNumbers(int size) {
        int[] numbers = new int[size];
        int i = 0; // индекс следующего простого числа в массиве numbers
        for (int x = 0; i < size; x++) {
            // x - потенциальное простое число
            if (isPlain(x)) {
                numbers[i] = x;
                i++; // индекс следующего простого числа в массиве numbers
            }
        }
        return numbers;
    }

    public static Boolean isPlain(int x) {
        if (x <= 1) {
            return false;
        }
        int delimiters = 0;
        for (int d = 2; d < x; d++) { // ! все ли эти числа нужно перебирать? !
            if (x % d == 0) { // если x делится на d без остатка
                delimiters++; // считаем количество делителей, кроме 1 и самого числа
            }
        }
        return delimiters == 0; // если делителей, кроме 1 и самого числа, нет, то число -- простое
    }
}
