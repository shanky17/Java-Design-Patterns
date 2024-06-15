package main.creationalPatterns.builder;

import java.util.List;

public class Student {
    private final int id;
    private final int age;
    private final String name;
    private final List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.getId();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.subjects = studentBuilder.getSubjects();
    }

    public String toString() {
        StringBuilder str = new StringBuilder("ID: " + this.id +
                " Age: " + this.age +
                " Name: " + this.name);
        str.append(" Subjects: (");
        for (String subject : this.subjects) {
            str.append(subject).append(",");
        }
        str.setCharAt(str.length() - 1, ')');

        return str.toString();
    }
}
