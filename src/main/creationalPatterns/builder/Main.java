package main.creationalPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Student student1 = director1.createStudent();
        System.out.println(student1);

        Director director2 = new Director(new MBAStudentBuilder());
        Student student2 = director2.createStudent();
        System.out.println(student2);
    }
}
