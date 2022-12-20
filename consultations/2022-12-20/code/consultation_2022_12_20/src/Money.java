import java.util.Objects;

public class Money {
    private int amount; // сумма
    private String currency; // валюта

    // функция, которая каждому объекту сопоставляет какое-то уникальное целое число
    // совпадение hashCode означает, что и сами объекты совпадают
    // HashCode
    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    // наше собственное сравнение с другим объектом
    // возвращает true, если объекты равны
    // возвращает false, если не равны
    // в этом методе мы определяем, что такое "равны"
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true; // это буквально две ссылки на один и тот же объект
        }

        // obj instanceof Money - obj является экземпляром класса Money или его класса-наследника
        // !(obj instanceof Money) - obj НЕ является экземпляром класса Money или его класса-наследника
        if (!(obj instanceof Money)) {
            System.out.println("obj - не Money!");
            return false; // obj - объект не класса Money, а какого-то другого
        }

        // здесь я окажусь, если obj - объект класса Money
        // НовыйТип новаяСсылка = (НовыйТип) стараяСсылка; // преобразование типов
        // после этого по новойСсылке я могу использовать все методы НовогоТипа
        Money other = (Money) obj;

        // суммы денег равны, если совпадает сумма и валюта
        return currency.equals(other.currency) && amount == other.amount;
    }
}
