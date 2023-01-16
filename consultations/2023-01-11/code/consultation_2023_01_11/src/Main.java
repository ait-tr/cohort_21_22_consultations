/*
Есть список с именами: Ivan, Maria, Stephan, John, Amalia. Написать функцию,которая вернет
список Person (String name) ,
 в котором не содержатся Person c именами из исходного списка,длиной 4

Создать список с именами
----------------------------------
List<String>  - >  List<Person>

Для каждого имени
  - проверить условие (длинна строки)
        - создать персона
        - добавить в лист результата

 */


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    public static ArrayList<Person> listNamesToListPerson(ArrayList<String> names){
        ArrayList<Person> people = new ArrayList<>();

        for (String name:names){
            if(name.length()>4){
                people.add(new Person(name));
            }
        }

        return people;
    }

}
