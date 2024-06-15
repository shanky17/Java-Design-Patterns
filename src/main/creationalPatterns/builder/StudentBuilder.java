package main.creationalPatterns.builder;

import java.util.List;

public abstract class StudentBuilder {
    int id;
    int age;
    String name;
    List<String> subjects;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public abstract StudentBuilder setSubjects();

    public List<String> getSubjects() {
        return subjects;
    }

    public Student build() {
        return new Student(this);
    }
}
