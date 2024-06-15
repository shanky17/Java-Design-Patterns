package main.creationalPatterns.prototype;

public class Student implements Prototype {

    int age;
    private int id;
    String name;

    Student(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(this.age, this.id, this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
