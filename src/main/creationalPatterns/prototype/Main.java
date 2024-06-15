package main.creationalPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(23, 1009, "Pinky");

        Student cloneObj = (Student) obj.clone();
        System.out.println(cloneObj);
    }
}
