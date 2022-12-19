package school;

public class Group {
    private String name;
    private Student[] students = new Student[10];
    private int studentsSize = 0;

    public Group(String name) {
        this.name = name;
    }

    private void addStudent(Student student) {
        if (studentsSize == students.length) {
            Student[] newStudents = new Student[students.length * 2];
            for (int i = 0; i < studentsSize; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
        students[studentsSize++] = student;
    }

    public Student addStudent(String name) {
        Student student = new Student(name, this);
        addStudent(student);
        return student;
    }

    protected String getName() {
        return name;
    }
}
