package java8;

import java.util.List;

public class Student {
    private int age;
    private List<Subject> subjects;
    private String studentName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Student(int age, List<Subject> subjects, String studentName) {
        this.age = age;
        this.subjects = subjects;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
