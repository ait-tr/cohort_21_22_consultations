public class Main {
    // equals, hashcode

    // метод equals -- public boolean equals(Object obj)
    // всё остальное с таким же названием -- не настоящее переопределение этого метода



    // кассовый аппарат
    public static void main(String[] args) {
        Money m1 = new Money();

        if (m1.equals("123")) {
            System.out.println("Совпадают");
        } else {
            System.out.println("Не совпадают");
        }
    }
}
