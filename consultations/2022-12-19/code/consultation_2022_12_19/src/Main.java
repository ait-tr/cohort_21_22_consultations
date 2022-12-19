import school.Group;
import school.Student;

public class Main {
    // повторение - циклы, классы, методы
    public static void main(String[] args) {
        Group group = new Group("AIT");
        Student student = group.addStudent("Kirill");
        student.rate(10);
        student.rate(9);
        student.rate(12);
        System.out.println(student);
    }
}
