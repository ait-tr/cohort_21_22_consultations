public class Main {
    public static int binaryToDec(int bin) { // 1100101
        // напишите метод, который принимает int
        // возвращает int
        // переводит из двоичной в десятичную
        // binaryToDec(111010) он вернет нам 58
        // https://calculatori.ru/perevod-chisel.html
        // разряд
        // цифра   цифра   цифра (основание) == цифра * основание ^ разряд + цифра * основание ^ разряд

        // 3210
        // 1234 = 1 * 10^3 + 2 * 10^2 + 3 * 10^1 + 4 * 10^0
        // % 10
        //  123 = 1 * 10^2 + 2 * 10^1 + 3 * 10^0, ост. 4

        // 6543210
        // 1100101 = 1 * 2 ^ 6 + 1 * 2 ^ 5 + 0 * 2 ^ 4
        int res = 0;
        int multiplier = 1;
        while (bin > 0) {
            int lastDigit = bin % 10;
            res += lastDigit * multiplier;
            bin /= 10; // целочисленное деление
            multiplier *= 2; // основание системы счисления в соответствующей степени
        }
        // дополнительный материал -- схема Горнера
        return res;
    }

    public static void main(String[] args) {

    }
}
