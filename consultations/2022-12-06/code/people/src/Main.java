public class Main {
    // вопросы:

    // - где ставить return
    public static Boolean isLeapYear(int year) {
        // return year > 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
        if (year < 0) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        // return year % 4 == 0;
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    // - неправильно работает старый код
    public static void game() {
        int[] playerMoney = new int[3]; // кошелек каждого игрока
        for (int i = 0; i < playerMoney.length; i++) {
            playerMoney[i] = 100; // дали денег каждому игроку
        }
        int a = 2, b = 2;

        for (int i = 0; i < playerMoney.length; i++, a++) {
            if (a == b) { //некое условие в игре
                for (int j = 0; j < playerMoney.length; j++) {
                    if (i == j) {
                        playerMoney[i] += 10; // победителю +10
                    } else {
                        playerMoney[j] -= 10; // с каждого другого игрока -10
                    }
                }
            }
            System.out.println(playerMoney[i]); // баланс конретного (i-го) игрока после i-го хода (а не в конце игры)
            // баланс всех игроков после i-го хода:
            // System.out.printf("%d, %d, %d\n", playerMoney[0], playerMoney[1], playerMoney[2]);
        }
        // баланс всех игроков после всех ходов:
        for (int i = 0; i < playerMoney.length; i++, a++) {
            System.out.println(playerMoney[i]);
        }
    }

    // - private и protected
    static Boolean isMore(People p1, People p2) {
        // return p1.persons.length > p2.persons.length;
        // так можно с protected, но нельзя с private
        return p1.isMore(p2);
    }

    public static void main(String[] args) {

    }
}
