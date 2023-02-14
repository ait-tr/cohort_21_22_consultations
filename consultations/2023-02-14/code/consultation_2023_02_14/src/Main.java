public class Main {
    public static void main(String[] args) {
        // удобный вспомогательный класс для обработки стрингов
        String initialStr = "start";

        StringBuilder text = new StringBuilder(initialStr);
        text.append("hey").append("hey").reverse();

        // как из стринг-билдера получить обратно стринг:
        String result = String.valueOf(text);          // вариант 1
        String result2 = text.toString();              // вариант 2
        String result3 = new String(new String(text)); // вариант 3

        // Когда использовать стрингбилдер?
        // Когда у нас есть много операций над стрингами, например,
        // когда мы что-то делаем со стрингом в цикле.
        StringBuilder newText = new StringBuilder(result3);
        for (int i = 0; i < 50; i++) {
            newText.append(" ").append(i);
        }
        System.out.println(newText);
        // методы почти такие, как в String
        StringBuilder text2 = new StringBuilder("Исходный текст");
        System.out.println(text2.capacity()); // по умолчанию 16 символов
        System.out.println(text2);
        text2.insert(2, " ПриветикИнсерт ");     // вставляет по индексу указанную строку
        System.out.println(text2);
        text2.compareTo(text);                            // метод который мы используем в компараторе
        System.out.println(text2);
        text2.replace(5, 9, "МетодРеплейс");  // удаляет с 5 по 9
        System.out.println(text2);
        text2.delete(0, 5);             //удаляет знаки с startIndex до endIndex(не включительно)
        System.out.println(text2);
        System.out.println(text2.capacity()); // показывает вместимость внутреннего массива под капотом
        System.out.println(text2.length());   // показывает длину - количество символов в тексте
        System.out.println(text2.isEmpty());  // показывает пустой ли стрингбилдер
        text2.setLength(10);
        System.out.println(text2);
        text2.appendCodePoint(67);  // добавляет символ по коду
        System.out.println(text2);
        text2.deleteCharAt(2); // удаляет символ по индексу
        System.out.println(text2);
        System.out.println(text2.indexOf("Репле"));
        String wordToDelete = "Репле";
        text2.append(" Word");
        System.out.println(text2);
        text2.delete(text2.indexOf(wordToDelete), text2.indexOf(wordToDelete) + wordToDelete.length());
        System.out.println(text2);
        String text3 = text2.substring(2, 6);
        System.out.println(text3);


    }


}
