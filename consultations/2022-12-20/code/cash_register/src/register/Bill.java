package register;

// Класс "Чек"
class Bill {
    private Row[] rows = new Row[10]; // строки чека
    private int rowsCount = 0; // количество строк в чеке, оно же - индекс первого пустого элемента в rows

    // добавить строку в текущий чек
    protected void addRow(String item, double price, double amount) {
        if (rowsCount == rows.length) {
            // массив rows заполнен, не можем больше ничего добавить
            Row[] newRows = new Row[rows.length * 2]; // делаем новый массив в два раза больше
            for (int i = 0; i < rowsCount; i++) {
                newRows[i] = rows[i]; // копируем ссылки из старого массива в новый
            }
            rows = newRows; // ссылка rows на массив строк теперь ведёт на новый (большой) массив
            // на старый массив ссылок больше нет, однажды его уничтожит сборщик мусора
        }

        rows[rowsCount] = new Row(item, price, amount); // положили новую строку в первый незаполненный элемент
        rowsCount++; // увеличили счётчик
    }
    @Override
    public String toString() {
        String result = "=== Чек ===\n";
        for (int i = 0; i < rowsCount; i++) { // только заполненные строчки, поэтому до rowsCount
            result += rows[i]; // rows[i].toString()
        }
        result += "Итог: " + getTotal() + "\n"; // добавляем в чек общий итог
        return result;
    }

    // общая сумма чека
    protected double getTotal() {
        double total = 0.0; // общая сумма чека
        for (int i = 0; i < rowsCount; i++) { // только заполненные строчки, поэтому до rowsCount
            total += rows[i].getTotal(); // добавить общую стоимость товара в этой строке
        }
        return total;
    }
}
