import javax.swing.*;
import java.util.Arrays;

public class People {
    Person[] persons;
    // protected - по умолчанию (если не написать ничего):
    // - доступен классам в том же пакете и классам-наследникам
    // private - доступен только внутри класса
    // - то есть всем методам класса
    // - изнутри метода можно достучаться до приватного поля любого экземпляра этого класса
    private int size;

    public People(int capacity) {
        persons = new Person[capacity];
        size = 0;
    }

    public void addPerson(Person person){
        if (size == persons.length) {
            Person[] new_persons = new Person[persons.length * 2];
            for (int i = 0; i < persons.length; i++) {
                new_persons[i] = persons[i]; // заполняем половину нового списка всем старым
            }
            persons = new_persons; // поле -- тоже ссылка, но на массив
            // перезаписали ссылку на старый массив ссылкой на новый массив
            // старый массив станет мусором, но всё полезное оттуда (все ссылки на людей)
            // мы уже скопировали
        }
        persons[size++] = person; // добавляем нового человека, как раньше
    }
    // можно задать вопрос про метод delete(Person) -- удаление человека

    public void printAllPersons(){
        for (int i = 0; i < size; i++) {
            System.out.println(persons[i]);
        }
    }

    public People getYoungPersons(int ageLimit) {
        Person[] temp_result = new Person[persons.length];
        int temp_size = 0;
        for (int i = 0; i < size; i++) {
            if (persons[i].getAge() < ageLimit) {
                // ссылка на того же человека
                temp_result[temp_size] = persons[i];
                // клон человека, чтобы имена или возраст можно было менять независимо
                // temp_result[temp_size] = new Person(persons[i].getName(), persons[i].getAge());
                temp_size++;
                // можно было бы и сразу добавить в новый People,
                // без промежуточного хранилища ссылок (или копий) temp_result
            }
        }

        People result = new People(temp_size);
        for (int i = 0; i < temp_size; ++i) {
            result.persons[i] = temp_result[i];
            // то же самое - result.addPerson(temp_result[i]);
        }
        // то же самое -- result.persons = temp_result;

        // Так короче и понятнее:
//        People result = new People(persons.length);
//        for (int i = 0; i < size; i++) {
//            if (persons[i].getAge() < ageLimit) {
//                result.addPerson(persons[i]);
//            }
//        }
        return result;
    }

    Boolean isMore(People others) {
        // так можно даже с private полями, потому что метод -- часть класса
        // и у него есть доступ к приватным полям любого экземпляра этого класса
        return persons.length > others.persons.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(persons);
    }
}
