public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        // константная сложность
        // линейная
        // квадратичная (со степенями)
        // логарифмическая log n
        int[] numbers = new int[]{11, 2, 3, 6, 8, 9, 12, 1, 29, 10, 12, 18, 20, 20};
        System.out.println(searchElement(numbers, 10));
        System.out.println(checkIfFirstEquals(numbers, 11));
//        10 10   100
//        12 12   144
        int[] numbers2 = new int[]{1, 2, 3, 6, 8, 9, 10, 12, 13, 16};
        System.out.println(numbers2.length / 2);
        // ищем 2
        Counter counter = (x) -> {
            for (int i = x; i >= 0; i--) {
                System.out.println(i);
            } // curly brackets
        };
        Counter counter1 = (x) -> System.out.println(x * 2);
        counter1.count(12);

        counter.count(15);
        useCounter(9, (x) -> {
            for (int i = x; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });
        NumInterface numLambda = (x) -> x - 10;
        System.out.println(numLambda.calculate(10));
        NumInterface numLambda2 = (x) -> x - 10 / 9;
        numLambda2.calculate(122);
    }

    public static void useCounter(int x, Counter counter) {
        counter.count(x);
    }

    public static boolean checkIfFirstEquals(int[] numbers, int aim) {
        return numbers[0] == aim;
    }

    public static int searchElement(int[] numbers, int aim) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == aim) {
                return i;
            }
        }
        return -1;
    }
}